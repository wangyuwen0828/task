package com.gupaoedu.singleton.lazy;

/**
 * 2019/5/21
 * wangyuwen
 */
public class ExectorThread implements  Runnable {
    @Override
    public void run() {
        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
