package com.hqyj.mc.Text;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class PackagingDemo {
    /*
    * 封装：
    *    把成员变量私有化，然后提供一组Setter\Getter分别来设置成成员变量的值、访问成员变量
    *
    * private
    * */

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("输入错误");
        } else {

            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void show(){
        System.out.println("我叫"+name+",年龄"+age);
    }
}
