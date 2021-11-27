package com.company;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        for ( int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                System.out.print(" " +i);
            }
        }
    }
}

