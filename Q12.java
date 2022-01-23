package com.company;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of eggs");
        int eggs = in.nextInt();
        int gross = eggs/144;
        eggs = eggs%144;
        System.out.println(eggs);
        int dozen = eggs/12;
        eggs = eggs%12;
//        int remain = (gross%144)%12;
//        System.out.println(remain);
        System.out.println("Number of eggs are "+gross+" gross "+dozen+" dozens and "+eggs);
    }
}
