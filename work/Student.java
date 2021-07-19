package com.hqyj.mc.work;

public class Student {
    //定义四个学生对象，添加到集合，并遍历
    private String name;
    private String stuNumber;
    private String sex;
    private int age;

    public Student(String name,String stuNumber,String sex,int age){
        this.name = name;
        this.stuNumber = stuNumber;
        this.sex = sex;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuNumber='" + stuNumber + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
