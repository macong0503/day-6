package com.hqyj.mc.Text;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Constructor;

public class TextConstructorDemo {
    public static void main(String[] args) {
        //创建对象
        TextConstructor cd = new TextConstructor();
        System.out.println(cd.name);
        System.out.println(cd.age);
        cd.name = "zhang";
        cd.age = 22;
        System.out.println(cd.name);
        System.out.println(cd.age);
        //通过有参构造实例化对象
        TextConstructor cd1 = new TextConstructor("zzz",23);
        System.out.println(cd1.name);
        System.out.println(cd1.age);

    }
}
