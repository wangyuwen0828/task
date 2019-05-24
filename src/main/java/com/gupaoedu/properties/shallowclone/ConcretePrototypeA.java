package com.gupaoedu.properties.shallowclone;

import java.util.List;

/**
 * 2019/5/24
 * wangyuwen
 */
public class ConcretePrototypeA implements Prototype {
    public String age;
    public String name;
    public List<String> hobbies;

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public ConcretePrototypeA clone() {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAge(this.getAge());
        concretePrototypeA.setName(this.getName());
        concretePrototypeA.setHobbies(this.getHobbies());
        return concretePrototypeA;
    }
}
