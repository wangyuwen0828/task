package com.gupaoedu.proxy.resource.staticproxy;

import com.gupaoedu.proxy.resource.Order;
import com.gupaoedu.proxy.resource.OrderService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2019/5/25
 * wangyuwen
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            order.setId("1");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = simpleDateFormat.parse("2017/01/12");
            order.setCreateTime(date);
            StaticOrderServiceProxy staticOrderServiceProxy = new StaticOrderServiceProxy(new OrderService());
            staticOrderServiceProxy.insertOrder(order);


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
