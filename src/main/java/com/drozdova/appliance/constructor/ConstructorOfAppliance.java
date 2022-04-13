package com.drozdova.appliance.constructor;

import com.drozdova.appliance.bean.*;
import com.drozdova.appliance.bean.criteria.SearchCriteria;

import java.util.Map;

public class ConstructorOfAppliance {

    private Map<String, String> applianceParams;

    public void setApplianceParams(Map<String, String> applianceParams) {
        this.applianceParams = applianceParams;
    }

    public Appliance constructLaptop() {
        Appliance appliance = null;
        if (applianceParams.get("APPLIANCE_TYPE").equals(Laptop.class.getSimpleName())) {
            appliance = Laptop.newBuilder()
                    .setBatteryCapacity(Double.parseDouble(applianceParams.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())))
                    .setOs(applianceParams.get(SearchCriteria.Laptop.OS.toString()))
                    .setMemoryRom(Integer.parseInt(applianceParams.get(SearchCriteria.Laptop.MEMORY_ROM.toString())))
                    .setSystemMemory(Integer.parseInt(applianceParams.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())))
                    .setCpu(Double.parseDouble(applianceParams.get(SearchCriteria.Laptop.CPU.toString())))
                    .setDisplayInches(Double.parseDouble(applianceParams.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString())))
                    .build();
        }

        return appliance;
    }

    public Appliance constructOven() {
        Appliance appliance = null;
        if (applianceParams.get("APPLIANCE_TYPE").equals(Oven.class.getSimpleName())) {
            appliance = Oven.newBuilder()
                    .setPowerConsumption(Integer.parseInt(applianceParams.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString())))
                    .setCapacity(Integer.parseInt(applianceParams.get(SearchCriteria.Oven.CAPACITY.toString())))
                    .setDepth(Double.parseDouble(applianceParams.get(SearchCriteria.Oven.DEPTH.toString())))
                    .setHeight(Double.parseDouble(applianceParams.get(SearchCriteria.Oven.HEIGHT.toString())))
                    .setWidth(Double.parseDouble(applianceParams.get(SearchCriteria.Oven.WIDTH.toString())))
                    .setWeight(Double.parseDouble(applianceParams.get(SearchCriteria.Oven.WEIGHT.toString())))
                    .build();
        }
        return appliance;
    }

    public Appliance constructRefrigerator() {
        Appliance appliance = null;
        if (applianceParams.get("APPLIANCE_TYPE").equals(Refrigerator.class.getSimpleName())) {
            appliance = Refrigerator.newBuilder()
                    .setPowerConsumption(Integer.parseInt(applianceParams.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())))
                    .setFreezerCapacity(Integer.parseInt(applianceParams.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())))
                    .setOverallCapacity(Double.parseDouble(applianceParams.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())))
                    .setWeight(Double.parseDouble(applianceParams.get(SearchCriteria.Refrigerator.WEIGHT.toString())))
                    .setHeight(Double.parseDouble(applianceParams.get(SearchCriteria.Refrigerator.HEIGHT.toString())))
                    .setWidth(Double.parseDouble(applianceParams.get(SearchCriteria.Refrigerator.WIDTH.toString())))
                    .build();
        }
        return appliance;
    }

    public Appliance constructSpeakers() {
        Appliance appliance = null;
        if (applianceParams.get("APPLIANCE_TYPE").equals(Speakers.class.getSimpleName())) {
            appliance = Speakers.newBuilder()
                    .setPowerConsumption(Integer.parseInt(applianceParams.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())))
                    .setNumberOfSpeakers(Integer.parseInt(applianceParams.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())))
                    .setFrequencyRange(applianceParams.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString()))
                    .setCordLength(Integer.parseInt(applianceParams.get(SearchCriteria.Speakers.CORD_LENGTH.toString())))
                    .build();
        }
        return appliance;
    }

    public Appliance constructTabletPC() {
        Appliance appliance = null;
        if (applianceParams.get("APPLIANCE_TYPE").equals(TabletPC.class.getSimpleName())) {
            appliance = TabletPC.newBuilder()
                    .setBatteryCapacity(Integer.parseInt(applianceParams.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())))
                    .setDisplayInches(Double.parseDouble(applianceParams.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())))
                    .setMemoryRom(Integer.parseInt(applianceParams.get(SearchCriteria.TabletPC.MEMORY_ROM.toString())))
                    .setFlashMemoryCapacity(Integer.parseInt(applianceParams.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())))
                    .setColor(applianceParams.get(SearchCriteria.TabletPC.COLOR.toString()))
                    .build();
        }
        return appliance;
    }

    public Appliance constructVacuumCleaner() {
        Appliance appliance = null;
        if (applianceParams.get("APPLIANCE_TYPE").equals(VacuumCleaner.class.getSimpleName())) {
            appliance = VacuumCleaner.newBuilder()
                    .setPowerConsumption(Integer.parseInt(applianceParams.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())))
                    .setFilterType(applianceParams.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString()))
                    .setBagType(applianceParams.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString()))
                    .setWandType(applianceParams.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString()))
                    .setMotorSpeedRegulation(Integer.parseInt(applianceParams.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())))
                    .setCleaningWidth(Integer.parseInt(applianceParams.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())))
                    .build();
        }
        return appliance;
    }
}
