package com.company;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the starting velocity");
        double v0 = in.nextDouble();
        System.out.println("Enter the final velocity");
        double v = in.nextDouble();
        System.out.println("Enter the time");
        double t = in.nextDouble();
        double a = (v - v0)/t;
        System.out.println("The average acceleration is "+ a);
    }
}
