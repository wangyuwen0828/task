package com.gupaoedu.factory.abstractFactory;

/**
 * 2019/5/21
 * wangyuwen
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createVideo().record();
        javaCourseFactory.createNote().edit();
    }
}
