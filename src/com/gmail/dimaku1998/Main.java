package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number = ");
        double r = sc.nextDouble();
        double C = 2 * Math.PI * r;
        System.out.println(" Lenght circle = " + C);
    }
}
