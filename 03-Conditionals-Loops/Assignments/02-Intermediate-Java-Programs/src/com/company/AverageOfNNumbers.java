package com.company;

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int sum = 0;

        System.out.println("Enter the "+n+" elements respectively: ");

        for(int i = 0; i < n; i++){
            int num = input.nextInt();
            sum += num;
        }
        double average = (double)sum / n;
        System.out.print("Average of " +sum+ " is: " +average);
    }
}
