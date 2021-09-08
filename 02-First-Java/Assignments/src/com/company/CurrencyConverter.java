package com.company;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        int inr = input.nextInt();

        float dollar = inr / 73.11F;
        System.out.println("Amount in dollars is: " + dollar);
    }
}
