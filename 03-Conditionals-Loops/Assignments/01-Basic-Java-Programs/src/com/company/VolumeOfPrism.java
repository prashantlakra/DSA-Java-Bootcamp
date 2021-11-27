package com.company;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base area of the prism: ");
        double base_area = input.nextDouble();

        System.out.print("Enter the height of the prism: ");
        double height = input.nextDouble();

        double volume = base_area * height;

        System.out.print("The volume of the prism is: " + volume);
    }
}
