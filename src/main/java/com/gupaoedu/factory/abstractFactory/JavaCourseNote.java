package com.gupaoedu.factory.abstractFactory;

/**
 * 2019/5/21
 * wangyuwen
 */
public class JavaCourseNote implements ICourseNote {
    @Override
    public void edit() {
        System.out.println("记录java笔记");
    }
}
