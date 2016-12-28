package com.ss.proj.examples;


public abstract class VehicleAbstact {

    private double capacity;

    public String getSteeringType() {

        return "some type";
    }

    public abstract double getDesilCapasity();

    public void setDesilCapacity(double capacity) {

        this.capacity = capacity;
    }

}
