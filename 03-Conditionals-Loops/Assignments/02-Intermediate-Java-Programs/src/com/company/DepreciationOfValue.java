package com.company;

import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        long amount, depreciationPercent, year, temp;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        amount = input.nextLong();

        System.out.print("Enter Depreciation percentage: ");
        depreciationPercent = input.nextLong();

        System.out.print("Enter number of years: ");
        year = input.nextLong();

        temp = amount;
        for(int i=0;i<year;i++)
            temp = ((100 - depreciationPercent) * temp) / 100;
        System.out.println("After depreciation = "+temp);
    }
}
