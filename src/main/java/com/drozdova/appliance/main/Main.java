package com.drozdova.appliance.main;

import com.drozdova.appliance.bean.Appliance;
import com.drozdova.appliance.bean.Laptop;
import com.drozdova.appliance.bean.Oven;
import com.drozdova.appliance.bean.TabletPC;
import com.drozdova.appliance.bean.criteria.Criteria;
import com.drozdova.appliance.bean.criteria.SearchCriteria;
import com.drozdova.appliance.service.ApplianceService;
import com.drozdova.appliance.service.ServiceFactory;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Appliance> appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());//"Laptop"
        criteriaLaptop.add(SearchCriteria.Laptop.MEMORY_ROM.toString(), 8000);
        appliance = service.find(criteriaLaptop);
        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 45.5);
        criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 60);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "blue");
        criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 8000);

        appliance = service.find(criteriaTabletPC);

        PrintApplianceInfo.print(appliance);
    }
}
