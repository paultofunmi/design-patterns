package com.creational;

public class SingletonEager {

    private static SingletonEager mySingletonEager = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {

        return mySingletonEager;
    }
}
