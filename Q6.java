package com.company;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter weight in ponds:");
        Scanner in= new Scanner(System.in);
        double pound = in.nextDouble();
        System.out.println("Enter height in inches");
        double inch = in.nextDouble();
        double kg = 0.45359237*pound;
        double mt = inch*0.0254;
        double BMI = kg/(mt*mt);
        System.out.println("BMI is " + BMI);
    }
}
