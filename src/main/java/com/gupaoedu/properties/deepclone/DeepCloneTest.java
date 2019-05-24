package com.gupaoedu.properties.deepclone;

/**
 * 2019/5/24
 * wangyuwen
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        Qitiandasheng qitiandasheng = new Qitiandasheng();
        Qitiandasheng qitiandasheng2 = qitiandasheng.deepclone();
//查看深克隆后是不是复制对象而不是复制地址
        System.out.println(qitiandasheng.jingubang == qitiandasheng2.jingubang);
    }
}
