package com.drozdova.appliance.bean;

import com.drozdova.appliance.bean.criteria.SearchCriteria;

import java.util.Map;
import java.util.Objects;

public class Speakers extends Appliance {
    // POWER_CONSUMPTION,
    // NUMBER_OF_SPEAKERS,
    // FREQUENCY_RANGE,
    // CORD_LENGTH
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers() {
    }

    public Speakers(Map<String, String> paramsMap) {
        this.powerConsumption = Integer.parseInt(paramsMap.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString()));
        this.numberOfSpeakers = Integer.parseInt(paramsMap.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString()));
        this.frequencyRange = paramsMap.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString());
        this.cordLength = Integer.parseInt(paramsMap.get(SearchCriteria.Speakers.CORD_LENGTH.toString()));
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

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Speakers speakers = (Speakers) o;
        return powerConsumption == speakers.powerConsumption && numberOfSpeakers == speakers.numberOfSpeakers && cordLength == speakers.cordLength && frequencyRange.equals(speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return Speakers.class.getName() + "{"
                + "powerConsumption=" + powerConsumption
                + ", numberOfSpeakers=" + numberOfSpeakers
                + ", frequencyRange='" + frequencyRange + '\''
                + ", cordLength=" + cordLength
                + "} " + super.toString();
    }
}
