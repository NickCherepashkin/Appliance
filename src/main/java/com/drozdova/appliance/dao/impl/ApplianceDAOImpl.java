package com.drozdova.appliance.dao.impl;

import com.drozdova.appliance.bean.Appliance;
import com.drozdova.appliance.bean.criteria.Criteria;
import com.drozdova.appliance.dao.ApplianceCreator;
import com.drozdova.appliance.dao.ApplianceDAO;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {
    private final String DB_PATH = "/appliances_db.txt";

    private ApplianceCreator creator = new ApplianceCreator();

    @Override
    public List <Appliance> find(Criteria criteria) throws IOException {
        File file;
        FileReader fileReader;
        BufferedReader reader = null;
        List <Appliance> appList = new ArrayList<>();

        try {
            URL res = ApplianceDAOImpl.class.getResource(DB_PATH);
            file = Paths.get(res.toURI()).toFile();
            fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);

            String findAppliance = criteria.getGroupSearchName();

            String line = reader.readLine();

            while(line != null) {
                if (!line.isEmpty()) {
                    if(line.contains(findAppliance)) {
                        boolean findResult = true;
                        for(Map.Entry<String, Object> entry: criteria.getCriteria().entrySet()) {
                            String subStr = entry.getKey() + "=" + entry.getValue();
                            if(!line.contains(subStr)) {
                                findResult = false;
                                break;
                            }
                        }
                        if (findResult) {
                            line = line.replace(";", "");
                            Appliance app = creator.create(findAppliance, line.split(" : ")[1]);
                            appList.add(app);
                        }
                    }
                }
                line = reader.readLine();
            }

        } catch (FileNotFoundException | URISyntaxException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        return appList;
    }
}
