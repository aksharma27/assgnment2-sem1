package com.company;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enterivestment amount:");
        double investment_amount  = in.nextDouble();
        System.out.println("Enter annual interest rate in percentage:");
        double annual_interest = in.nextDouble();
        System.out.println("Enter number of years:");
        int years = in.nextInt();
        double finvestment = investment_amount*(Math.pow((1+(annual_interest/1200)), (years*12)));
        System.out.println("Accumulated value is "+finvestment);
    }
}
