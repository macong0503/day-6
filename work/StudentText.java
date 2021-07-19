package com.hqyj.mc.work;

import java.util.ArrayList;

public class StudentText {
    public static void main(String[] args) {
        ArrayList<Student> StuList = new ArrayList<>();

        StuList.add(new Student("张三","1008611","男",18));
        StuList.add(new Student("张四","1008612","男",19));
        StuList.add(new Student("张五","1008613","男",20));
        StuList.add(new Student("张六","1008614","男",21));

        System.out.println(StuList);
    }
}
