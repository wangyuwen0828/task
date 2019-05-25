package com.gupaoedu.proxy.staticproxy;

/**
 * 2019/5/25
 * wangyuwen
 */
public class FatherProxyTest {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
