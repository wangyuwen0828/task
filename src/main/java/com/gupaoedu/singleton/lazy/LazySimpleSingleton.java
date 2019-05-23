package com.gupaoedu.singleton.lazy;

/**
 * 2019/5/21
 * wangyuwen
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazy=null;
    public static LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
