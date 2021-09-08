package com.company;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String result = (n % 2 == 0) ? "This number is even" : "This number is odd";
        System.out.println(result);
    }
}
