package com.gupaoedu.factory.factoryMethod;

/**
 * 2019/5/21
 * wangyuwen
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
