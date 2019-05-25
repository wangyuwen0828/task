package com.gupaoedu.proxy.resource;

import java.util.Date;

/**
 * 2019/5/25
 * wangyuwen
 */
public class Order {


    private String id;
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
