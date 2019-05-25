package com.gupaoedu.proxy.resource;

/**
 * 2019/5/25
 * wangyuwen
 */
public class OrderService implements IOrderService {
    private OrderDao orderDao;

    public OrderService(){
        this.orderDao = new OrderDao();
    }
    @Override
    public void insertOrder(Order order) {
        this.orderDao.insert(order);
        System.out.println("orderService保存数据完成");
    }
}
