package com.learningJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double r, h;
        Scanner sc = new Scanner( System.in);

        System.out.println("Radius: ");
        r = sc.nextDouble();
        System.out.println("Height: ");
        h = sc.nextDouble();

        cylindervolume(r, h);
    }
    static void cylindervolume (double r, double h){
        double v;
        final double PI = 3.1416;

        v = PI * r * r * h;
        System.out.println("The volume of the cylinder is:  " + v);
    }
}
