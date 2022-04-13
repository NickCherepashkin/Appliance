package com.drozdova.appliance.bean;

import java.util.Objects;

public class Oven extends Appliance{
    private int powerConsumption;
    private int capacity;

    private Oven() {
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

    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Oven oven = (Oven) o;
        return getPowerConsumption() == oven.getPowerConsumption() && getCapacity() == oven.getCapacity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumption(), getCapacity());
    }

    @Override
    public String toString() {
        return Oven.class.getSimpleName() +  " : " +
                "powerConsumption=" + powerConsumption +
                ", capacity=" + capacity +
                ", " + super.toString();
    }

    public static Builder newBuilder() {
        return new Oven().new Builder();
    }

    public class Builder extends Appliance.Builder {
        private Builder() {}

        public Builder setPowerConsumption(int powerConsumption) {
            Oven.this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder setCapacity(int capacity) {
            Oven.this.capacity = capacity;
            return this;
        }

        public Oven build() {
            return Oven.this;
        }
    }
}
