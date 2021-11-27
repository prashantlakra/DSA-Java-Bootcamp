package com.company;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side of the square: ");
        double side = input.nextDouble();
        System.out.print("The perimeter of the square is: " + (side * 4));
    }
}
