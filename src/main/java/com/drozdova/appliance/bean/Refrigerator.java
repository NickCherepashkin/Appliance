package com.drozdova.appliance.bean;

import java.util.Objects;

public class Refrigerator extends Appliance{
    private int powerConsumption;
    private int freezerCapacity;
    private double overallCapacity;

    private Refrigerator() {
    }

    public Refrigerator(double width, double height, double weight, int powerConsumption, int freezerCapacity, double overallCapacity) {
        super(width, 0, height, weight);
        this.powerConsumption = powerConsumption;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return getPowerConsumption() == that.getPowerConsumption() && getFreezerCapacity() == that.getFreezerCapacity() && Double.compare(that.getOverallCapacity(), getOverallCapacity()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumption(), getFreezerCapacity(), getOverallCapacity());
    }

    @Override
    public String toString() {
        return Refrigerator.class.getSimpleName() + " : " +
                "powerConsumption=" + powerConsumption +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                " " + super.toString();
    }

    public static Builder newBuilder() {
        return new Refrigerator().new Builder();
    }

    public class Builder extends Appliance.Builder{
        private Builder() {}

        public Builder setPowerConsumption(int powerConsumption) {
            Refrigerator.this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder setFreezerCapacity(int freezerCapacity) {
            Refrigerator.this.freezerCapacity = freezerCapacity;
            return this;
        }

        public Builder setOverallCapacity(double overallCapacity) {
            Refrigerator.this.overallCapacity = overallCapacity;
            return this;
        }

        public Refrigerator build() {
            return Refrigerator.this;
        }
    }
}
