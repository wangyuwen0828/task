package com.gupaoedu.factory.abstractFactory;

/**
 * 2019/5/21
 * wangyuwen
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourseVideo createVideo() {
        return new JavaCourseVideo();
    }

    @Override
    public ICourseNote createNote() {
        return new JavaCourseNote();
    }
}
