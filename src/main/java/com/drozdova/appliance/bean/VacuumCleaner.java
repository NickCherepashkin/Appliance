package com.drozdova.appliance.bean;

import java.util.Objects;

public class VacuumCleaner extends Appliance {
    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    private VacuumCleaner() {
    }

    public VacuumCleaner(double width, double depth, double height, double weight, int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        super(width, depth, height, weight);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return getPowerConsumption() == that.getPowerConsumption() && getMotorSpeedRegulation() == that.getMotorSpeedRegulation() && getCleaningWidth() == that.getCleaningWidth() && Objects.equals(getFilterType(), that.getFilterType()) && Objects.equals(getBagType(), that.getBagType()) && Objects.equals(getWandType(), that.getWandType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumption(), getFilterType(), getBagType(), getWandType(), getMotorSpeedRegulation(), getCleaningWidth());
    }

    @Override
    public String toString() {
        return VacuumCleaner.class.getSimpleName() + " : " +
                "powerConsumption=" + powerConsumption +
                ", filterType=" + filterType +
                ", bagType='" + bagType + "'" +
                ", wandType='" + wandType + "'" +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                " " + super.toString();
    }

    public static Builder newBuilder() {
        return new VacuumCleaner().new Builder();
    }

    public class Builder extends Appliance.Builder {
        private Builder() {}

        public Builder setPowerConsumption(int powerConsumption) {
            VacuumCleaner.this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder setFilterType(String filterType) {
            VacuumCleaner.this.filterType = filterType;
            return this;
        }

        public Builder setBagType(String bagType) {
            VacuumCleaner.this.bagType = bagType;
            return this;
        }

        public Builder setWandType(String wandType) {
            VacuumCleaner.this.wandType = wandType;
            return this;
        }

        public Builder setMotorSpeedRegulation(int motorSpeedRegulation) {
            VacuumCleaner.this.motorSpeedRegulation = motorSpeedRegulation;
            return this;
        }

        public Builder setCleaningWidth(int cleaningWidth) {
            VacuumCleaner.this.cleaningWidth = cleaningWidth;
            return this;
        }

        public VacuumCleaner build() {
            return VacuumCleaner.this;
        }
    }
}
