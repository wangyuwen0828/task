package com.gupaoedu.factory.abstractFactory;

/**
 * 2019/5/21
 * wangyuwen
 */
public interface ICourseFactory {
    public ICourseVideo createVideo();
    public ICourseNote createNote();

}
