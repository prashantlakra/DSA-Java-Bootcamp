package com.company;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of one diagonal of the rhombus: ");
        double d1 = input.nextDouble();

        System.out.print("Enter the length of the other diagonal of the rhombus: ");
        double d2 = input.nextDouble();

        double area = (d1*d2)/2;

        System.out.print("The area of the rhombus is: " + area);
    }
}
