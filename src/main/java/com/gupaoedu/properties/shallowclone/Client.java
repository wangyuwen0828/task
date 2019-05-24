package com.gupaoedu.properties.shallowclone;

/**
 * 2019/5/24
 * wangyuwen
 */
public class Client {
    private Prototype prototype;

    public Prototype startClone(Prototype prototype){
       return  prototype.clone();
    }
}
