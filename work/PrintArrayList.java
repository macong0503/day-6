package com.hqyj.mc.work;

import java.util.ArrayList;

public class PrintArrayList {

    //打印方法{元素@元素@元素}
    public void printList(ArrayList list) {
        System.out.print("{");
        for (int i = 0; i < list.size() ; i++) {
            if (i == list.size() - 1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+"@");
            }
        }
        System.out.print("}");


}


}
