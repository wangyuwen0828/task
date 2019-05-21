package com.gupaoedu.factory.abstractFactory;

/**
 * 2019/5/21
 * wangyuwen
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourseVideo createVideo() {
        return new PythonCourseVideo();
    }

    @Override
    public ICourseNote createNote() {
        return new PythonCourseNote();
    }
}
