package com.gupaoedu.proxy.gpproxy;

import java.lang.reflect.Method;

/**
 * 2019/5/25
 * wangyuwen
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
