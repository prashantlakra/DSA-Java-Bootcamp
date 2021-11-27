package com.company;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        while (num > 0) {
            sum = sum + num;
            num = input.nextInt();
        }
        System.out.println("Sum of entered numbers: " +sum);
    }
}
