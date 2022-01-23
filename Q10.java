package com.company;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        System.out.println("Enter three points for a triangle");
        Scanner in = new Scanner(System.in);
        float x1 = in.nextFloat();
        float y1 = in.nextFloat();
        float x2 = in.nextFloat();
        float y2 = in.nextFloat();
        float x3 = in.nextFloat();
        float y3 = in.nextFloat();
        double s = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2))+Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2))+Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));
        double area = Math.sqrt(s*(s-Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2)))*(s-Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2)))*Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2)));
        System.out.println("The area of the triangle is "+area);
    }
}
