package com.gupaoedu.factory.factoryMethod;

import com.gupaoedu.factory.factoryMethod.ICourse;

/**
 * 2019/5/21
 * wangyuwen
 */
public class BigDataCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制大数据视频");
    }
}
