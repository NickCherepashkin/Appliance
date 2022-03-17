package com.drozdova.appliance.dao;

import com.drozdova.appliance.bean.*;

public class ApplianceCreator {
    public Appliance create(String applianceType, String appliance) {
        String [] criteriaList = appliance.split(", ");
        String symbolForSplit = "=";
        switch (applianceType) {
            case "Oven":
                Oven oven = new Oven();
                oven.setPowerConsumption(Integer.parseInt(criteriaList[0].split(symbolForSplit)[1]));
                oven.setWeight(Double.parseDouble(criteriaList[1].split(symbolForSplit)[1]));
                oven.setCapacity(Integer.parseInt(criteriaList[2].split(symbolForSplit)[1]));
                oven.setDepth(Double.parseDouble(criteriaList[3].split(symbolForSplit)[1]));
                oven.setHeight(Double.parseDouble(criteriaList[4].split(symbolForSplit)[1]));
                oven.setWidth(Double.parseDouble(criteriaList[5].split(symbolForSplit)[1]));
                return oven;
            case "Laptop":
                Laptop laptop = new Laptop();
                laptop.setBatteryCapacity(Double.parseDouble(criteriaList[0].split(symbolForSplit)[1]));
                laptop.setOs(criteriaList[1].split(symbolForSplit)[1]);
                laptop.setMemoryRom(Integer.parseInt(criteriaList[2].split(symbolForSplit)[1]));
                laptop.setSystemMemory(Integer.parseInt(criteriaList[3].split(symbolForSplit)[1]));
                laptop.setCpu(Double.parseDouble(criteriaList[4].split(symbolForSplit)[1]));
                laptop.setDisplayInches(Double.parseDouble(criteriaList[5].split(symbolForSplit)[1]));
                return laptop;
            case "Refrigerator":
                Refrigerator refrigerator = new Refrigerator();
                refrigerator.setPowerConsumption(Integer.parseInt(criteriaList[0].split(symbolForSplit)[1]));
                refrigerator.setWeight(Double.parseDouble(criteriaList[1].split(symbolForSplit)[1]));
                refrigerator.setFreezerCapacity(Integer.parseInt(criteriaList[2].split(symbolForSplit)[1]));
                refrigerator.setOverallCapacity(Double.parseDouble(criteriaList[3].split(symbolForSplit)[1]));
                refrigerator.setHeight(Double.parseDouble(criteriaList[4].split(symbolForSplit)[1]));
                refrigerator.setWidth(Double.parseDouble(criteriaList[5].split(symbolForSplit)[1]));
                return refrigerator;
            case "VacuumCleaner":
                VacuumCleaner vacuumCleaner = new VacuumCleaner();
                vacuumCleaner.setPowerConsumption(Integer.parseInt(criteriaList[0].split(symbolForSplit)[1]));
                vacuumCleaner.setFilterType(criteriaList[1].split(symbolForSplit)[1]);
                vacuumCleaner.setBagType(criteriaList[2].split(symbolForSplit)[1]);
                vacuumCleaner.setWandType(criteriaList[3].split(symbolForSplit)[1]);
                vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(criteriaList[4].split(symbolForSplit)[1]));
                vacuumCleaner.setCleaningWidth(Integer.parseInt(criteriaList[5].split(symbolForSplit)[1]));
                return vacuumCleaner;
            case "TabletPC":
                TabletPC tabletPC = new TabletPC();
                tabletPC.setBatteryCapacity(Integer.parseInt(criteriaList[0].split(symbolForSplit)[1]));
                tabletPC.setDisplayInches(Double.parseDouble(criteriaList[1].split(symbolForSplit)[1]));
                tabletPC.setMemoryRom(Integer.parseInt(criteriaList[2].split(symbolForSplit)[1]));
                tabletPC.setFlashMemoryCapacity(Integer.parseInt(criteriaList[3].split(symbolForSplit)[1]));
                tabletPC.setColor(criteriaList[4].split(symbolForSplit)[1]);
                return  tabletPC;
            case "Speakers":
                Speakers speakers = new Speakers();
                speakers.setPowerConsumption(Integer.parseInt(criteriaList[0].split(symbolForSplit)[1]));
                speakers.setNumberOfSpeakers(Integer.parseInt(criteriaList[1].split(symbolForSplit)[1]));
                speakers.setFrequencyRange(criteriaList[2].split(symbolForSplit)[1]);
                speakers.setCordLength(Integer.parseInt(criteriaList[3].split(symbolForSplit)[1]));
                return speakers;
        }
        return null;
    }
}
