package com.gupaoedu.proxy.gpproxy.demo;

import com.gupaoedu.proxy.gpproxy.GPClassLoader;
import com.gupaoedu.proxy.gpproxy.GPInvocationHandler;
import com.gupaoedu.proxy.gpproxy.GPProxy;

import java.lang.reflect.Method;

/**
 * 2019/5/25
 * wangyuwen
 */
public class Meipo implements GPInvocationHandler {
    //被代理的对象
    public Object target;

    public Object getInstance(Object target) throws Exception {
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        before();
        method.invoke(this.target,args);
        after();
        return null;
    }

    private void before(){
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }
    private void after(){
        System.out.println("如果合适的话，就准备办事");
    }
}
