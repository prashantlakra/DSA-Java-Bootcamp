package com.company;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();

        double curvedSurfaceArea = 2 * Math.PI * radius * height;

        System.out.print("Curved Surface Area of Cylinder is: " + curvedSurfaceArea);
    }
}
