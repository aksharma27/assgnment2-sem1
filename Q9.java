package com.company;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter x1 and y1");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.println("Enter x2 and y2");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double dist = Math.sqrt(Math.pow((x2 -x1),2)+Math.pow((y2 - y1),2));
        System.out.println("The distance between the two points is "+dist);
    }
}
