package com.company;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = input.nextDouble();

        double area = length * width;

        System.out.print("Area of rectangle is " + area);
    }
}
