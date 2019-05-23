package com.gupaoedu.singleton.lazy;

/**
 * 2019/5/21
 * wangyuwen
 */
public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton(){}

    private static LazyDoubleCheckSingleton lazy=null;
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                lazy = new LazyDoubleCheckSingleton();
            }
        }
        return lazy;
    }
}
