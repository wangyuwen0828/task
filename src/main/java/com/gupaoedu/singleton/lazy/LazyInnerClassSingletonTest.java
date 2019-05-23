package com.gupaoedu.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * 2019/5/21
 * wangyuwen
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        try{
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
            System.out.println(o1==o2);

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
