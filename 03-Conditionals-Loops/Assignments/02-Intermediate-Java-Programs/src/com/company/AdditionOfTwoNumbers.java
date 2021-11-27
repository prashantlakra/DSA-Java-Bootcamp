package com.company;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        int n1, n2, sum;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        n1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        n2 = input.nextInt();

        sum = n1 + n2;
        System.out.print("Sum of these numbers: "+sum);
    }
}
