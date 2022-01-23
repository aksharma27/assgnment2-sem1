package com.company;

public class Q19 {
    public static void main(String[] args) {
        float sal = Float.parseFloat(args[0]);
        float da = (float) (0.4*sal);
        float hra = (float)(0.2*sal);
        float gross = sal-(da+hra);
        System.out.println("gross pay is :"+ gross);

    }
}
