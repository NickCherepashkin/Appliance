package com.drozdova.appliance.bean;

import java.util.Objects;

public class Laptop extends Appliance{
    // BATTERY_CAPACITY,
    // OS,
    // MEMORY_ROM,
    // SYSTEM_MEMORY,
    // CPU,
    // DISPLAY_INCHS
    private double batteryCapacity;        // емкость батареи
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private double displayInches;

    public Laptop() {
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

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 && memoryRom == laptop.memoryRom && systemMemory == laptop.systemMemory && Double.compare(laptop.cpu, cpu) == 0 && Double.compare(laptop.displayInches, displayInches) == 0 && os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInches);
    }

    @Override
    public String toString() {
        return Laptop.class.getName() + "{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                '}';
    }
}
