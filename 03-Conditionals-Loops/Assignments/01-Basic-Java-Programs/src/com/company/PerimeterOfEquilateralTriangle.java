package com.company;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a side of equilateral triangle: ");
        double side = input.nextDouble();

        System.out.print("The perimeter of the equilateral triangle is " + (3 * side) + ".");
    }
}
