package com.company;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        double sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter how many number: ");
        int num = input.nextInt();

        System.out.print("Please enter numbers: ");
        for(int i = 1; i<=num; i++){

            int numbers = input.nextInt();
            sum += numbers;
        }
        System.out.println("Sum is :" + sum);
    }
}
