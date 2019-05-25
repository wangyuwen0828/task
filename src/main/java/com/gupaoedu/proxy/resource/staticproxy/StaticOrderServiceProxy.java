package com.gupaoedu.proxy.resource.staticproxy;

import com.gupaoedu.proxy.resource.DynamicDataSourceEntry;
import com.gupaoedu.proxy.resource.IOrderService;
import com.gupaoedu.proxy.resource.Order;
import com.gupaoedu.proxy.resource.OrderService;

import java.text.SimpleDateFormat;

/**
 * 2019/5/25
 * wangyuwen
 */
public class StaticOrderServiceProxy implements IOrderService {
    private OrderService orderService;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");

    public StaticOrderServiceProxy(OrderService orderService){
        this.orderService = orderService;
    }

    @Override
    public void insertOrder(Order order) {
        before();
        Integer year = Integer.valueOf(simpleDateFormat.format(order.getCreateTime()));
        System.out.println("静态代理类自动分配到【DB_" + year + "】数据源处理数据。");
        DynamicDataSourceEntry.set(year);
        orderService.insertOrder(order);
        after();
    }

    private void before(){
        System.out.println("Proxy before method.");
    }
    private void after(){
        System.out.println("Proxy after method.");
    }
}
