package com.company;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int sum =0;
        while(i!=0){
            sum = sum + i%10;
            i/=10;
        }
        System.out.println("The sumof the digits is "+ sum);
    }
}
