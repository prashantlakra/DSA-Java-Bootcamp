package com.company;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the pyramid: ");
        double length = input.nextInt();

        System.out.print("Enter the width of the pyramid: ");
        double width = input.nextInt();

        System.out.print("Enter the height of the pyramid: ");
        double height = input.nextInt();

        double volume = (length * width * height) / 3;

        System.out.print("The volume of the pyramid is: " + volume);
    }
}
