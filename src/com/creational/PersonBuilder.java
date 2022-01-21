package com.creational;

public class PersonBuilder {

    private final String fname;
    private final String lname;
    private final int age;
    private final String sex;

    private PersonBuilder(Builder builder) {

        this.fname = builder.fname;
        this.lname = builder.lname;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static class Builder {

        private String fname;
        private String lname;
        private int age;
        private String sex;

        Builder(String fName) {
            this.fname = fName;
        }

        Builder lName(String lName) {

            this.lname = lName;
            return this;
        }

        Builder age(int age) {

            this.age = age;
            return this;
        }

        Builder sex(String sex) {

            this.sex = sex;
            return this;
        }

        public PersonBuilder create() {

            return new PersonBuilder(this);
        }
    }
}
