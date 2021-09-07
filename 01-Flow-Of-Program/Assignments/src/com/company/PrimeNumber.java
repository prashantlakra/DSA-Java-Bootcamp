package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num % 2 == 0)
            System.out.println("It is not a prime number");
        else
            System.out.println("It is a prime number");
    }
}
