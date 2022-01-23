package com.company;

import java.util.Random;

public class Q16 {
    public static void main(String[] args) {
        Random r = new Random();
        int r1 = r.nextInt(6)+1;

        int r2 = r.nextInt(6)+1;
        System.out.println(r1+" "+r2);
        System.out.println("sum is :" + (r1+r2));
    }
}
