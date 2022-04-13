package com.drozdova.appliance.main;

import com.drozdova.appliance.bean.Appliance;

import java.util.List;

public class PrintApplianceInfo {
    private static final String SEARCH_RESULTS = "Search results: ";
    private static final String APPLIANCES_NOT_FOUND = "appliances not found. ";
    public static void print(List<Appliance> appliance) {
        System.out.print(SEARCH_RESULTS);
        if (appliance.size() == 0) {
            System.out.println(APPLIANCES_NOT_FOUND);
        } else {
            System.out.println();
            for (Appliance app: appliance) {
                System.out.println(app.toString());
            }
        }
        System.out.println();
    }
}
