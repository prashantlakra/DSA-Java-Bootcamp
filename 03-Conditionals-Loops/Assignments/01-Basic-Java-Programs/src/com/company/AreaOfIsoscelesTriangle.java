package com.company;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of same sided: ");
        double side = input.nextDouble();

        System.out.print("Enter the length of base: ");
        double base = input.nextDouble();

        double area = (base/4)*Math.sqrt((4*side*side)-(base*base));

        System.out.print("The area of Isosceles Triangle is: " + area);
    }
}
