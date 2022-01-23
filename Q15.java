package com.company;

public class Q15 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int r = (int)(Math.random()*(b-a+1)+a);
        System.out.println(a);
    }
}
