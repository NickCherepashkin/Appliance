package com.drozdova.appliance.bean;

import com.drozdova.appliance.bean.criteria.SearchCriteria;

import java.util.Map;

public class Oven extends Appliance{
    // POWER_CONSUMPTION,
    // WEIGHT,
    // CAPACITY,
    // DEPTH,
    // HEIGHT,
    // WIDTH
    private int powerConsumption;
    private int capacity;

    public Oven() {
        super();
    }

    public Oven(Map<String, String> paramsMap) {
        this.powerConsumption = Integer.parseInt(paramsMap.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString()));
        this.setWeight(Double.parseDouble(paramsMap.get(SearchCriteria.Oven.WEIGHT.toString())));
        this.capacity = Integer.parseInt(paramsMap.get(SearchCriteria.Oven.CAPACITY.toString()));
        this.setDepth(Double.parseDouble(paramsMap.get(SearchCriteria.Oven.DEPTH.toString())));
        this.setHeight(Double.parseDouble(paramsMap.get(SearchCriteria.Oven.HEIGHT.toString())));
        this.setWidth(Double.parseDouble(paramsMap.get(SearchCriteria.Oven.WIDTH.toString())));

    }

    public Oven(int powerConsumption, double weight, int capacity, double depth, double height, double width) {
        super(width, depth, height, weight);
        this.powerConsumption = powerConsumption;
        this.capacity = capacity;
    }

    public Oven(int powerConsumption, int capacity) {
        this.powerConsumption = powerConsumption;
        this.capacity = capacity;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return Oven.class.getName() +  "{" +
                "powerConsumption=" + powerConsumption +
                ", capacity=" + capacity +
                "} " + super.toString();
    }
}
