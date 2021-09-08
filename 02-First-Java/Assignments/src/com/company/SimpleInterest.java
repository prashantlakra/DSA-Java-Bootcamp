package com.company;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principle amount: ");
        int principleAmount = input.nextInt();

        System.out.print("Enter the rate of return: ");
        float rateOfReturn = input.nextFloat();

        System.out.print("Enter the invested time in years: ");
        int timeInvested = input.nextInt();

        float simpleInterest = (principleAmount * rateOfReturn * timeInvested) / 100;
        System.out.println("The simple interest is: "+simpleInterest);
    }
}
