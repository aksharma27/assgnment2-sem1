package com.company;

import java.util.Scanner;
//package com.company;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter radius and length of cylinder");
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double l = in.nextDouble();
        double area = r *r*Math.PI;
//        System.out.println(Math.PI);
        double vol= area*l;
        System.out.println(" The Area is : " + area + "\n The  Volume is : "+vol);
    }


}
