package com.drozdova.appliance.bean;

import java.util.Objects;

public class TabletPC extends Appliance {
        // BATTERY_CAPACITY,
        // DISPLAY_INCHES,
        // MEMORY_ROM,
        // FLASH_MEMORY_CAPACITY,
        // COLOR
        private int batteryCapacity;
        private double displayInches;
        private int memoryRom;
        private int flashMemoryCapacity;
        private String color;

        public TabletPC() {
        }

        public TabletPC(double width, double depth, double height, double weight, int batteryCapacity, double displayInches, int memoryRom, int flashMemoryCapacity, String color) {
                super(width, depth, height, weight);
                this.batteryCapacity = batteryCapacity;
                this.displayInches = displayInches;
                this.memoryRom = memoryRom;
                this.flashMemoryCapacity = flashMemoryCapacity;
                this.color = color;
        }

        public int getBatteryCapacity() {
                return batteryCapacity;
        }

        public void setBatteryCapacity(int batteryCapacity) {
                this.batteryCapacity = batteryCapacity;
        }

        public double getDisplayInches() {
                return displayInches;
        }

        public void setDisplayInches(double displayInches) {
                this.displayInches = displayInches;
        }

        public int getMemoryRom() {
                return memoryRom;
        }

        public void setMemoryRom(int memoryRom) {
                this.memoryRom = memoryRom;
        }

        public int getFlashMemoryCapacity() {
                return flashMemoryCapacity;
        }

        public void setFlashMemoryCapacity(int flashMemoryCapacity) {
                this.flashMemoryCapacity = flashMemoryCapacity;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) {
                        return true;
                }
                if (o == null || getClass() != o.getClass()) {
                        return false;
                }
                TabletPC tabletPC = (TabletPC) o;
                return batteryCapacity == tabletPC.batteryCapacity && Double.compare(tabletPC.displayInches, displayInches) == 0 && memoryRom == tabletPC.memoryRom && flashMemoryCapacity == tabletPC.flashMemoryCapacity && color.equals(tabletPC.color);
        }

        @Override
        public int hashCode() {
                return Objects.hash(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
        }

        @Override
        public String toString() {
                return TabletPC.class.getName() + "{" +
                        "batteryCapacity=" + batteryCapacity +
                        ", displayInches=" + displayInches +
                        ", memoryRom=" + memoryRom +
                        ", flashMemoryCapacity=" + flashMemoryCapacity +
                        ", color='" + color + '\'' +
                        "} " + super.toString();
        }
}
