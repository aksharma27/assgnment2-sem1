package com.company;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        System.out.println("Enter minutes");
        Scanner in = new Scanner(System.in);
        long min = in.nextLong();
        long years = min/365;
        long days = min%365;
//        double days = min;
        System.out.println(min + " minutes is approximately "+years+" years and "+ days +" days");
    }
}
