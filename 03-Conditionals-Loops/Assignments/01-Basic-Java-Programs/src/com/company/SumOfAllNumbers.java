package com.company;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        do{
            num = in.nextInt();
            sum = sum + num;
        }
        while (num != 0);
        System.out.print("Sum = " + sum);
    }
}
