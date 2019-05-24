package com.gupaoedu.properties.deepclone;

import java.io.Serializable;

/**
 * 2019/5/24
 * wangyuwen
 */
public class Jingubang implements Serializable {
    public float width;
    public float height;
    public void big(){
        this.width*=2;
        this.height*=2;
    }
    public void small(){
        this.width/=2;
        this.height/=2;
    }

}
