package com.gupaoedu.proxy.gpproxy;

import com.gupaoedu.proxy.Person;
import com.gupaoedu.proxy.gpproxy.demo.Agent;
import com.gupaoedu.proxy.gpproxy.demo.Meipo;
import com.gupaoedu.proxy.staticproxy.Son;

/**
 * 2019/5/25
 * wangyuwen
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person) new Agent().getInstance(new Son());
            obj.findJob();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
