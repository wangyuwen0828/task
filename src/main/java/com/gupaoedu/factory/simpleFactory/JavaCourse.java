package com.gupaoedu.factory.simpleFactory;

/**
 * 2019/5/21
 * wangyuwen
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Java视频");
    }
}
