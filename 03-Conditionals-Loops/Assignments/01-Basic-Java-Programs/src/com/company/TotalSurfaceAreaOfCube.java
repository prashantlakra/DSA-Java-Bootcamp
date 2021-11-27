package com.company;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the cube: ");
        double side = input.nextDouble();

        double totalSurfaceArea = 6 * side * side;

        System.out.println("The total surface area of the cube is: " + totalSurfaceArea);
    }
}
