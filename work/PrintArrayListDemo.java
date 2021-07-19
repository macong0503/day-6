package com.hqyj.mc.work;

import java.util.ArrayList;

public class PrintArrayListDemo {
    public static void main(String[] args) {
        PrintArrayList pl = new PrintArrayList();

        ArrayList<String> list = new ArrayList<>();
        list.add("啊啊啊");
        list.add("aaa");
        list.add("嗷嗷嗷");

        pl.printList(list);
    }
}
