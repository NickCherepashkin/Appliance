package com.drozdova.appliance.bean;

import java.util.Objects;

public class Appliance {
    private double width;
    private double depth;
    private double height;
    private double weight;

    public Appliance() {
    }

    public Appliance(double width, double depth, double height, double weight) {
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return Double.compare(appliance.getWidth(), getWidth()) == 0 && Double.compare(appliance.getDepth(), getDepth()) == 0 && Double.compare(appliance.getHeight(), getHeight()) == 0 && Double.compare(appliance.getWeight(), getWeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getDepth(), getHeight(), getWeight());
    }

    @Override
    public String toString() {
        return  "width=" + width +
                ", depth=" + depth +
                ", height=" + height +
                ", weight=" + weight ;
    }

    public class Builder {
        protected Builder() {}

        public Builder setWidth(double width) {
            Appliance.this.width = width;
            return this;
        };

        public Builder setDepth(double depth) {
            Appliance.this.depth = depth;
            return this;
        };

        public Builder setHeight(double height) {
            Appliance.this.height = height;
            return this;
        };

        public Builder setWeight(double weight) {
            Appliance.this.weight = weight;
            return this;
        };

        public Appliance build() {
            return Appliance.this;
        }
    }
}
