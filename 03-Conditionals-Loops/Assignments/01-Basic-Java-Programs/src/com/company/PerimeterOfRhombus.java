package com.company;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of Rhombus: ");
        float side= input.nextFloat();
        System.out.print("Perimeter of Rhombus is: " + (side * 4));
    }
}
