package com.drozdova.appliance.bean;

import java.util.Objects;

public class Laptop extends Appliance{
    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private double displayInches;

    private Laptop() {
    }

    public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, double displayInches) {
        super();
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.getBatteryCapacity(), getBatteryCapacity()) == 0 && getMemoryRom() == laptop.getMemoryRom() && getSystemMemory() == laptop.getSystemMemory() && Double.compare(laptop.getCpu(), getCpu()) == 0 && Double.compare(laptop.getDisplayInches(), getDisplayInches()) == 0 && Objects.equals(getOs(), laptop.getOs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBatteryCapacity(), getOs(), getMemoryRom(), getSystemMemory(), getCpu(), getDisplayInches());
    }

    @Override
    public String toString() {
        return Laptop.class.getSimpleName() + " : " +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + "'" +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches;
    }

    public static Builder newBuilder() {
        return new Laptop().new Builder();
    }

    public class Builder extends Appliance.Builder {

        private Builder() {
        }

        public Builder setBatteryCapacity(double batteryCapacity) {
            Laptop.this.batteryCapacity = batteryCapacity;
            return this;
        }

        public Builder setOs(String os) {
            Laptop.this.os = os;
            return this;
        }

        public Builder setMemoryRom(int memoryRom) {
            Laptop.this.memoryRom = memoryRom;
            return this;
        }

        public Builder setSystemMemory(int systemMemory) {
            Laptop.this.systemMemory = systemMemory;
            return this;
        }

        public Builder setCpu(double cpu) {
            Laptop.this.cpu = cpu;
            return this;
        }

        public Builder setDisplayInches(double displayInches) {
            Laptop.this.displayInches = displayInches;
            return this;
        }

        public Laptop build() {
            return Laptop.this;
        }
    }
}
