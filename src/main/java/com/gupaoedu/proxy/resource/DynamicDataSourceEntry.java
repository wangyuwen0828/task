package com.gupaoedu.proxy.resource;

/**
 * 2019/5/25
 * wangyuwen
 */
public class DynamicDataSourceEntry {
    public final static String DEFAULT_SOURCE=null;

    public final static ThreadLocal<String> local = new ThreadLocal<>();
    private DynamicDataSourceEntry(){}

    public static void set(String resource){
        local.set(resource);
    }

    public static void set(int year){
        local.set("DB_"+year);
    }

    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }

    public static String  get(){
        return local.get();
    }

    public static void clear(){
        local.remove();
    }
}
