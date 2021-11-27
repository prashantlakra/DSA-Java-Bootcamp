package com.company;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of sphere: ");
        double radius = input.nextDouble();

        double volume = (4 * Math.PI * radius * radius * radius) / 3;

        System.out.print("The volume of sphere is: " + volume);
    }
}
