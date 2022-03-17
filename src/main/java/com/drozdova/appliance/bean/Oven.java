package com.drozdova.appliance.bean;

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

    public Oven(int powerConsumption, double weight, int capacity, double depth, double height, double width) {
        super(width, depth, height, weight);
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
