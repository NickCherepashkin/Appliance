package com.drozdova.appliance.main;

import com.drozdova.appliance.bean.Appliance;

import java.util.List;

public class PrintApplianceInfo {
    public static void print(List<Appliance> appliance) {
        for (Appliance app: appliance) {
            System.out.println(app.toString());
        }
    }
}
