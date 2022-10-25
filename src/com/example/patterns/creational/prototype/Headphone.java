package com.example.patterns.creational.prototype;

public class Headphone implements Copyable{

    private String name;
    private int lowFreqLimit;
    private int upFreqLimit;
    private boolean availabilityMicrophone;

    public Headphone(String name, int lowFreqLimit, int upFreqLimit, boolean availabilityMicrophone) {
        this.name = name;
        this.lowFreqLimit = lowFreqLimit;
        this.upFreqLimit = upFreqLimit;
        this.availabilityMicrophone = availabilityMicrophone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLowerFrequencyLimit() {
        return lowFreqLimit;
    }

    public void setLowerFrequencyLimit(int lowFreqLimit) {
        this.lowFreqLimit = lowFreqLimit;
    }

    public int getUpperFrequencyLimit() {
        return upFreqLimit;
    }

    public void setUpperFrequencyLimit(int upFreqLimit) {
        this.upFreqLimit = upFreqLimit;
    }

    public boolean isAvailabilityMicrophone() {
        return availabilityMicrophone;
    }

    public void setAvailabilityMicrophone(boolean availabilityMicrophone) {
        this.availabilityMicrophone = availabilityMicrophone;
    }

    @Override
    public Object copy() {
        Headphone headphoneCopy = new Headphone(name, lowFreqLimit, upFreqLimit, availabilityMicrophone);
        return headphoneCopy;
    }

    @Override
    public String toString() {
        return "Headphone{" +
                "name='" + name + '\'' +
                ", lowFreqLimit=" + lowFreqLimit +
                ", upFreqLimit=" + upFreqLimit +
                ", availabilityMicrophone=" + availabilityMicrophone +
                '}';
    }
}
