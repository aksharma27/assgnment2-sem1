package com.company;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Enter the side of a hexagon");
        Scanner in = new Scanner(System.in);
        double length = in.nextDouble();
        double a = (3*(Math.sqrt(3))*Math.pow(length, 2))/2;
        System.out.println("Area of the hexagon is "+ a);
    }
}
