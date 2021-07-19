package com.hqyj.mc.Text;

import java.util.ArrayList;

public class StudentText1 {
    public static void main(String[] args) {

        ArrayList<Student> StudentArrayList = new ArrayList<>();
        StudentArrayList.add(new Student("张三", "1008611","man",18));
        StudentArrayList.add(new Student("张四","1008612","man", 18));
        StudentArrayList.add(new Student("张五", "1008613","man",18));
        System.out.println(StudentArrayList);
        StudentArrayList.add(new Student("张六","1008614","woman", 19));
        System.out.println(StudentArrayList);

        Student stu01 = new Student("张七","1008616","man",18);
        //StudentArrayList.add(stu01);
        //System.out.println(StudentArrayList);

        System.out.println("------------------");
        //插入
        boolean stu0 = StudentArrayList.add(stu01);
        System.out.println("现在的集合是："+StudentArrayList);
        System.out.println("----------");
        //删除
        Student stu = StudentArrayList.remove(0);
        System.out.println("被删除的是："+stu);
        System.out.println("现在的集合是："+StudentArrayList);
        System.out.println("----------");

        //取出
        Student stu1 = StudentArrayList.get(2);
        System.out.println("被取出的是："+stu1);
        System.out.println("现在的集合是："+StudentArrayList);
        System.out.println("----------");

        //统计长度
        int stu2 = StudentArrayList.size();
        System.out.println("集合的中元素的个数："+stu2);
        System.out.println("现在的集合是："+StudentArrayList);
        System.out.println("----------");

    }
}
