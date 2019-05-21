package com.gupaoedu.factory.factoryMethod;

/**
 * 2019/5/21
 * wangyuwen
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory javaFactory = new JavaCourseFactory();
        ICourse javaCourse = javaFactory.create();
        javaCourse.record();

        ICourseFactory bigDataFactory = new BigDataCourseFactory();
        ICourse bigDataCourse = bigDataFactory.create();
        bigDataCourse.record();
    }
}
