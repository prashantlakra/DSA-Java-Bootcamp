package com.company;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side of the equilateral triangle: ");
        double side = input.nextDouble();

        double area = (Math.sqrt(3)/4)*side*side;

        System.out.print("The area of the equilateral triangle is " + area);
    }
}
