package com.company;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the base of Parallelogram: ");
        float base= input.nextFloat();

        System.out.print("enter the height of Parallelogram: ");
        float height= input.nextFloat();

        System.out.print("Perimeter of Parallelogram is: " + 2*(base + height));
    }
}
