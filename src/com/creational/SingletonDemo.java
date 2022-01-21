package com.creational;

public class SingletonDemo {

    public static void main(String[] args) {

        //First call initializes the resource
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy1);
        System.out.println(singletonLazy2);

        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager1);
        System.out.println(singletonEager2);
    }

}
