package com.hqyj.mc.Text;

import java.lang.reflect.Constructor;

public class TextConstructor {

    /*构造函数
    *
    * 定义格式：
    *      public 类名（参数列表）{}
    * 参数列表：
    *      有参数就写 ，没参数就不写
    * 注意事项：
    *      java中默认提供一个构造方法，无参构造
    * */
    //属性，成员变量
    String name;
    int age;

    public TextConstructor(){

    }

    public TextConstructor(String name,int age){
        //如果形式参数和成员变量的名字相同，默认就是形式参数，而使用不到成员变量
        //使用this可以解决，this.成员变量 访问的就是成员变量
        this.name=name;
        this.age=age;
    }
}
