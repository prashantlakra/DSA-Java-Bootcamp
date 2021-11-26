package com.company;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        float radius = input.nextFloat();

        double aoc = 3.14 * radius * radius;
        System.out.print("The area of circle is: " +aoc);
    }
}
