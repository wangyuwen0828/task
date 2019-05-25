package com.gupaoedu.proxy.resource.dynamicproxy;

import com.gupaoedu.proxy.resource.DynamicDataSourceEntry;
import com.sun.org.apache.bcel.internal.util.ClassLoader;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 2019/5/25
 * wangyuwen
 */
public class DynamicOrderServiceProxy implements InvocationHandler {
    private Object target;

    public Object getInstance(Object object) throws Exception{
        this.target = object;
        Class<?> clazz =object.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    //Object[] args是传递给被代理对象方法的参数
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(this.target,args);
        after();
        return object;
    }

    private void before(Object object){
        System.out.println(object);
    }

    private void after(){
        System.out.println("Proxy after method");
        DynamicDataSourceEntry.restore();
    }
}
