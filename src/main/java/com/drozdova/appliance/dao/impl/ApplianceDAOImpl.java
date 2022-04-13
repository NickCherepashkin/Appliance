package com.drozdova.appliance.dao.impl;

import com.drozdova.appliance.bean.Appliance;
import com.drozdova.appliance.bean.criteria.Criteria;
import com.drozdova.appliance.constructor.ConstructorOfAppliance;
import com.drozdova.appliance.dao.ApplianceDAO;

import java.io.*;
import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List <Appliance> find(Criteria criteria) throws IOException {
        File file;
        FileReader fileReader;
        BufferedReader reader = null;
        List<Appliance> appList = new ArrayList<>();
        ConstructorOfAppliance constructor = new ConstructorOfAppliance();

        try {

            String DB_FILE_NAME = "appliances_db.txt";
            String filePath = Objects.requireNonNull(getClass().getClassLoader().getResource(DB_FILE_NAME)).getPath();
            file = new File(filePath);
            fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);

            String findAppliance = criteria.getGroupSearchName();
            String line = reader.readLine();
            Map<String, String> paramsFromDB = new HashMap<>();
            Map<String, Object> mapAppliance = new HashMap<>();

            String subStr;
            while (line != null) {
                if (!line.isEmpty()) {
                    if (line.contains(findAppliance)) {
                        boolean findResult = true;

                        for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
                            subStr = entry.getKey() + "=" + entry.getValue();
                            if (!line.contains(subStr)) {
                                findResult = false;
                                break;
                            }
                        }

                        if (findResult) {
                            parseParams(line, paramsFromDB);
                            constructor.setApplianceParams(paramsFromDB);
                            Appliance app = (Appliance) createAppliance(mapAppliance, constructor).get(findAppliance);
                            appList.add(app);
                        }
                    }
                }
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Error. File appliances_db.txt not found");
        } catch (NullPointerException e) {
            throw new RuntimeException("Error. File name is not correct.");
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        return appList;
    }

    private Map<String, Object> createAppliance(Map<String, Object> mapAppliance, ConstructorOfAppliance constructor) {
        mapAppliance.clear();
        mapAppliance.put( "Laptop", constructor.constructLaptop());
        mapAppliance.put("Oven", constructor.constructOven());
        mapAppliance.put("Refrigerator", constructor.constructRefrigerator());
        mapAppliance.put("Speakers", constructor.constructSpeakers());
        mapAppliance.put("TabletPC", constructor.constructTabletPC());
        mapAppliance.put("VacuumCleaner", constructor.constructVacuumCleaner());
        return mapAppliance;
    }

    private void parseParams(String line, Map<String, String> paramsOfAppliance) {
        paramsOfAppliance.clear();
        line = line.trim().replace(" ", "").replace(";", "");
        paramsOfAppliance.put("APPLIANCE_TYPE", line.split(":")[0]);
        line = line.split(":")[1].trim().replace("=", " ").replace(",", " ");
        String [] params = line.split(" ");

        for(int i = 0; i < params.length; i += 2) {
            paramsOfAppliance.put(params[i], params[i + 1]);
        }
    }
}
