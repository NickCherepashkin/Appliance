package com.drozdova.appliance.bean;

import java.util.Objects;

public class TabletPC extends Appliance {
        private int batteryCapacity;
        private double displayInches;
        private int memoryRom;
        private int flashMemoryCapacity;
        private String color;

        private TabletPC() {
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

        public double getDisplayInches() {
                return displayInches;
        }

        public int getMemoryRom() {
                return memoryRom;
        }

        public int getFlashMemoryCapacity() {
                return flashMemoryCapacity;
        }

        public String getColor() {
                return color;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                if (!super.equals(o)) return false;
                TabletPC tabletPC = (TabletPC) o;
                return getBatteryCapacity() == tabletPC.getBatteryCapacity() && Double.compare(tabletPC.getDisplayInches(), getDisplayInches()) == 0 && getMemoryRom() == tabletPC.getMemoryRom() && getFlashMemoryCapacity() == tabletPC.getFlashMemoryCapacity() && Objects.equals(getColor(), tabletPC.getColor());
        }

        @Override
        public int hashCode() {
                return Objects.hash(super.hashCode(), getBatteryCapacity(), getDisplayInches(), getMemoryRom(), getFlashMemoryCapacity(), getColor());
        }

        @Override
        public String toString() {
                return TabletPC.class.getSimpleName() + " : " +
                        "batteryCapacity=" + batteryCapacity +
                        ", displayInches=" + displayInches +
                        ", memoryRom=" + memoryRom +
                        ", flashMemoryCapacity=" + flashMemoryCapacity +
                        ", color='" + color + "'" +
                        " " + super.toString();
        }

        public static Builder newBuilder() {
                return new TabletPC().new Builder();
        }

        public class Builder extends Appliance.Builder{
                private Builder() {}

                public Builder setBatteryCapacity(int batteryCapacity) {
                        TabletPC.this.batteryCapacity = batteryCapacity;
                        return this;
                }

                public Builder setDisplayInches(double displayInches) {
                        TabletPC.this.displayInches = displayInches;
                        return this;
                }

                public Builder setMemoryRom(int memoryRom) {
                        TabletPC.this.memoryRom = memoryRom;
                        return this;
                }

                public Builder setFlashMemoryCapacity(int flashMemoryCapacity) {
                        TabletPC.this.flashMemoryCapacity = flashMemoryCapacity;
                        return this;
                }

                public Builder setColor(String color) {
                        TabletPC.this.color = color;
                        return this;
                }

                public TabletPC build() {
                        return TabletPC.this;
                }
        }
}
