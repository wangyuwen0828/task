package com.gupaoedu.singleton.lazy;

import java.io.Serializable;

/**
 * 2019/5/22
 * wangyuwen
 */
public class SeriableSingleton implements Serializable {
    private static final SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton newInstance(){
        return seriableSingleton;
    }
    private Object readResolve(){
        return seriableSingleton;
    }
}
