package com.company;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the cone: ");
        double radius = input.nextDouble();

        System.out.print("Enter the height of the cone: ");
        double height = input.nextDouble();

        double volume = (Math.PI * radius * radius) * height / 3;

        System.out.print("The volume of the cone is: " + volume);
    }
}
