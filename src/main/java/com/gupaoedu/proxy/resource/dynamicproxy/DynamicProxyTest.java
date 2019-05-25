package com.gupaoedu.proxy.resource.dynamicproxy;

import com.gupaoedu.proxy.resource.IOrderService;
import com.gupaoedu.proxy.resource.Order;
import com.gupaoedu.proxy.resource.OrderService;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2019/5/25
 * wangyuwen
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = simpleDateFormat.parse("2017/12/11");
            Order order = new Order();
            order.setId("22");
            order.setCreateTime(date);
            DynamicOrderServiceProxy dynamicOrderServiceProxy = new DynamicOrderServiceProxy();
            IOrderService orderService= (IOrderService)dynamicOrderServiceProxy.getInstance(new OrderService());
            orderService.insertOrder(order);

            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{IOrderService.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
