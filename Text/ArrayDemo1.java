package com.hqyj.mc.Text;

import java.util.ArrayList;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //ArrayList作为方法的参数和返回值
        //1、创建一个对象
        ArrayList<String> list = new ArrayList<>();
        //2、传入方法
        ArrayList<String> list1 = printAyyay();
        for (String str : list) {
            System.out.println(str);
        }
    }
    public static ArrayList<String> printAyyay(){
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("yyds");
        for (String s : list) {
            System.out.print(s + " ");
        }
        return list;
    }
}
