package com.gupaoedu.factory.simpleFactory;

import javax.swing.*;

/**
 * 2019/5/21
 * wangyuwen
 */
public class CourseFactory {
    public static ICourse create(Class<? extends ICourse> clazz){
        try{
            if(clazz!=null){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
