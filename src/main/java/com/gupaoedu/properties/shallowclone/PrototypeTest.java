package com.gupaoedu.properties.shallowclone;

import java.util.ArrayList;
import java.util.List;

/**
 * 2019/5/24
 * wangyuwen
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setName("tom");
        concretePrototypeA.setAge("11");
        List<String> hobbies = new ArrayList<>();
        concretePrototypeA.setHobbies(hobbies);

        Client client = new Client();
        ConcretePrototypeA concretePrototypeA1 = (ConcretePrototypeA) client.startClone(concretePrototypeA);

        System.out.println(concretePrototypeA.getHobbies() == concretePrototypeA1.getHobbies());
    }
}
