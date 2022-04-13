package com.drozdova.appliance.bean;

import java.util.Objects;

public class Speakers extends Appliance {
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    private Speakers() {
    }

    public Speakers(double width, double depth, double height, double weight, int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
        super(width, depth, height, weight);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Speakers speakers = (Speakers) o;
        return getPowerConsumption() == speakers.getPowerConsumption() && getNumberOfSpeakers() == speakers.getNumberOfSpeakers() && getCordLength() == speakers.getCordLength() && Objects.equals(getFrequencyRange(), speakers.getFrequencyRange());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPowerConsumption(), getNumberOfSpeakers(), getFrequencyRange(), getCordLength());
    }

    @Override
    public String toString() {
        return Speakers.class.getSimpleName() + " : "
                + "powerConsumption=" + powerConsumption
                + ", numberOfSpeakers=" + numberOfSpeakers
                + ", frequencyRange='" + frequencyRange + "'"
                + ", cordLength=" + cordLength
                + " " + super.toString();
    }

    public static Builder newBuilder() {
        return new Speakers().new Builder();
    }

    public class Builder extends Appliance.Builder{
        private Builder() {}

        public Builder setPowerConsumption(int powerConsumption) {
            Speakers.this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder setNumberOfSpeakers(int numberOfSpeakers) {
            Speakers.this.numberOfSpeakers = numberOfSpeakers;
            return this;
        }

        public Builder setFrequencyRange(String frequencyRange) {
            Speakers.this.frequencyRange = frequencyRange;
            return this;
        }

        public Builder setCordLength(int cordLength) {
            Speakers.this.cordLength = cordLength;
            return this;
        }

        public Speakers build() {
            return Speakers.this;
        }

    }
}
