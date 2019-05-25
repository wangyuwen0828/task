package com.gupaoedu.proxy.staticproxy;

import com.gupaoedu.proxy.Person;

/**
 * 2019/5/25
 * wangyuwen
 */
public class Father implements Person {
    private Son son;

    public Father(Son son){
        this.son = son;
    }

    @Override
    public void findLove() {
        System.out.println("父母无色对象");
        son.findLove();
        System.out.println("相亲结束，准备结婚");
    }

    @Override
    public void findJob() {
        System.out.println("自己去找");
    }
}
