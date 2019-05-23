package com.gupaoedu.singleton.hungry;

/**
 * 2019/5/21
 * wangyuwen
 */
public class HungryStaticSingleton {
    public static final HungryStaticSingleton hungrySingleton;
    static{
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }

}
