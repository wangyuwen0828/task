package com.gupaoedu.factory.simpleFactory;

/**
 * 2019/5/21
 * wangyuwen
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        courseFactory.create(JavaCourse.class);
    }
}
