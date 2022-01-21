package com.behavioral.iterator;

import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        CourseRepository courseRepository = new CourseRepository();

        courseRepository.addCourse("Cooking");
        courseRepository.addCourse("Baking");
        courseRepository.addCourse("Singing");

        Iterator<String> itr = courseRepository.iterator();

        while(itr.hasNext()) {

            System.out.println(itr.next());
        }

    }
}
