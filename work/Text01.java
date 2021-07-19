package com.hqyj.mc.work;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Text01 {
    public static void main(String[] args) {

        //生成6个1~33之间的随机数，并存到集合，并遍历
        ArrayList<Integer> List = new ArrayList<>();
        //生成随机数
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int n = (random.nextInt(33)+1);
            List.add(n);
        }
        for (Integer i : List) {
            System.out.print(i +" ");
        }
    }
}
