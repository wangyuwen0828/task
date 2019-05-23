package com.gupaoedu.singleton.register;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 2019/5/22
 * wangyuwen
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
       /* EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton) ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);


        }catch(Exception e){
            e.printStackTrace();
        }*/
        /*try{
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor();
            c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }*/
        try{
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton) c.newInstance("Tom",666);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
