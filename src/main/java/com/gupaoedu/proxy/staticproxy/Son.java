package com.gupaoedu.proxy.staticproxy;

import com.gupaoedu.proxy.Person;

/**
 * 2019/5/25
 * wangyuwen
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("肤白貌美大长腿");
    }

    @Override
    public void findJob() {
        System.out.println("我要找好工作");
    }
}
