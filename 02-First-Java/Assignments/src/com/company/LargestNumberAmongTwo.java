package com.company;

import java.util.Scanner;

public class LargestNumberAmongTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        String result = (a > b) ? a+ " is largest" : b+ " is largest";

        System.out.println(result);
    }
}
