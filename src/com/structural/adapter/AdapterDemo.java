package com.structural.adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        MovableAdapterImpl bugattiMovableAdapter = new MovableAdapterImpl(new BugattiVeyron());
        System.out.println(bugattiMovableAdapter.getSpeed());
    }
}
