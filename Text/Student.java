package com.hqyj.mc.Text;

public class Student {
    //成员变量
    private String name;
    private String stuNumber;
    private String genner;
    private int age;

    //无参构造
    public Student(){

    }

    //有参构造
    public Student(String name,String stuNumber,String genner,int age){
        this.name=name;
        this.stuNumber=stuNumber;
        this.genner=genner;
        this.age=age;
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    //setter\getter

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String 张三) {
        return name;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getGenner() {
        return genner;
    }

    public void setGenner(String genner) {
        this.genner = genner;
    }

    public String getStuNumber(String s) {
        return stuNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void show(){
        System.out.println("我叫"+name+",学号是"+stuNumber+",性别是"+genner+",年龄"+age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuNumber='" + stuNumber + '\'' +
                ", genner='" + genner + '\'' +
                ", age=" + age +
                '}';
    }
}
