package com.structural.adapter;

/**
 * https://www.baeldung.com/java-adapter-pattern
 */
public class MovableAdapterImpl implements MovableAdapter {

    private Movable movable;

    public MovableAdapterImpl(Movable movable) {

        this.movable = movable;
    }

    public double getSpeed() {

        System.out.println("Computing speed in kmph");
        return convertMPHtoKMPH(movable.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
