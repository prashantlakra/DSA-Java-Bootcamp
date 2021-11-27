package com.company;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers: " );
        int input;
        int large = 0;
        int counter = 0;
        int small = 0;
        while ((input = sc.nextInt()) != 0) {

            if (counter == 0)
                small = large = input;

            counter++;

            if (input > large)
                large = input;

            if (input < small)
                small = input;
        }
        System.out.print("Largest number is: " + large);
    }
}
