package com.company;

public class Q17 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int ab = a+b;
        int bc = b+c;
        int ac = a+b;
        if(c>= ab){
            System.out.println("true");
        }
        if (a>= bc){
            System.out.println("true");
        }
        if (b >= ac){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
