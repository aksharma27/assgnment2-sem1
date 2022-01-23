package com.company;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter temperature in celcius");
        Scanner in = new Scanner(System.in);
        double c = in.nextDouble();
        double f = (1.8)*c +32;
        System.out.println(c+ " in Fahrenheit is : " + f);
    }
}
