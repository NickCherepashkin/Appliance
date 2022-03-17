package com.drozdova.appliance.bean;

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

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "width=" + width +
                ", depth=" + depth +
                ", height=" + height +
                ", weight=" + weight ;
    }
}
