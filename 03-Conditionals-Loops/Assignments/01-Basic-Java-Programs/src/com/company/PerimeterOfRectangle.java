package com.company;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        float length = in.nextFloat();
        System.out.print("Enter the width of rectangle: ");
        float width = in.nextFloat();
        System.out.print("Perimeter of Rectangle is: " + 2*(length + width));
    }
}
