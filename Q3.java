package com.company;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter the value in feet :");
        Scanner in = new Scanner(System.in);
        double d = in.nextDouble();
        double metres = d*0.305;
        System.out.println(d+" feet is "+metres+" metres");
    }
}
