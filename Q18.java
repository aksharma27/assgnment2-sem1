package com.company;

public class Q18 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        if (x<y && y<z)
        {
            System.out.println("strictly increasing");
        }
        if (z>y && y>x)
        {
            System.out.println("Strictly decreasing");
        }
    }
}
