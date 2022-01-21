package com.behavioral.iterator;

import java.util.Iterator;

public class CourseRepository implements Iterable<String> {

    private String courses[];
    private int index;

    CourseRepository() {
        courses = new String[0];
        index = 0;
    }

    public int getSize() {

        return courses.length;
    }
    public void addCourse(String course) {

        if(index == courses.length) {

            System.out.println("Adding new course item");
            String[] moreCourses = new String[courses.length + 1];
            System.arraycopy(courses, 0, moreCourses, 0, courses.length);
            courses = moreCourses;
        }

        courses[index] = course;
        index++;
    }

    @Override
    public Iterator<String> iterator() {

        Iterator<String> itr = new Iterator<String>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < courses.length;
            }

            @Override
            public String next() {
                return courses[currentIndex++];
            }
        };

        return itr;
    }
}
