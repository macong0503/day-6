package com.hqyj.mc.work;

import java.util.ArrayList;

public class ouArrayList {
    //定义获取所有偶数集合的方法

    public void ouList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(99);
        list.add(3);
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i) % 2 != 0){
                list.remove(i);
                i--;
            }

        }
        System.out.println(list);
    }
}
