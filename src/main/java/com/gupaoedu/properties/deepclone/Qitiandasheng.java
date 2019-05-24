package com.gupaoedu.properties.deepclone;

import java.io.*;
import java.util.Date;

/**
 * 2019/5/24
 * wangyuwen
 */
public class Qitiandasheng extends Monkey implements Cloneable, Serializable {
    public Jingubang jingubang;

    public Qitiandasheng(){
        this.jingubang = new Jingubang();
        this.date = new Date();
    }
    public Object clone() throws CloneNotSupportedException{
        return deepclone();
    }

    public Qitiandasheng deepclone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Qitiandasheng copy = (Qitiandasheng) ois.readObject();
            copy.date = new Date();
            return copy;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
