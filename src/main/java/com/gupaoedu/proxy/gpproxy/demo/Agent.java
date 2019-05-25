package com.gupaoedu.proxy.gpproxy.demo;

import com.gupaoedu.proxy.gpproxy.GPClassLoader;
import com.gupaoedu.proxy.gpproxy.GPInvocationHandler;
import com.gupaoedu.proxy.gpproxy.GPProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 2019/5/25
 * wangyuwen
 */
public class Agent implements GPInvocationHandler {
    public Object target;

    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(this.target,args);
        after();
        return null;
    }

    public void before(){
        System.out.println("中介开始帮忙寻找工作");
    }

    public void after(){
        System.out.println("中介帮忙寻找工作结束");
    }
}
