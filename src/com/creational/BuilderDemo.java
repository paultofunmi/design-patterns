package com.creational;

public class BuilderDemo {

    public static void main(String[] args) {

        PersonBuilder personBuilder1 = new PersonBuilder.Builder("John").create();
        System.out.println(personBuilder1);

        PersonBuilder personBuilder2 = new PersonBuilder.Builder("John").lName("Alade").create();
        System.out.println(personBuilder2);

        PersonBuilder personBuilder3 = new PersonBuilder.Builder("John").lName("Alade").sex("Male").create();
        System.out.println(personBuilder3);
    }
}
