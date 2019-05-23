package com.gupaoedu.singleton.hungry;

/**
 * 2019/5/21
 * wangyuwen
 */
public class HungrySingleton {
    public static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
