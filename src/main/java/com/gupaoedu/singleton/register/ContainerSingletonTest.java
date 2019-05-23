package com.gupaoedu.singleton.register;

/**
 * 2019/5/22
 * wangyuwen
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        ContainerSingleton.getBean("com.gupaoedu.factory.abstractFactory.JavaCourseNote");
    }
}
