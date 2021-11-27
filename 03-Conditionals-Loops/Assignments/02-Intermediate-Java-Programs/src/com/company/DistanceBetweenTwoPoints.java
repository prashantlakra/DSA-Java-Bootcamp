package com.company;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1, x2, y1, y2;
        double distance;

        System.out.print("Enter the coordinates of the first point (x1,y1): ");
        x1 = input.nextInt();
        y1 = input.nextInt();

        System.out.print("Enter the coordinates of the second point (x2,y2): ");
        x2 = input.nextInt();
        y2 = input.nextInt();

        // using the distance formula
        distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.print("The distance between the two points is " + distance);
    }
}
