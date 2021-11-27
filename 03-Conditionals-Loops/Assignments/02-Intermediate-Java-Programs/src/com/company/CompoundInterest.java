package com.company;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principle = input.nextDouble();

        System.out.print("Enter Rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter time: ");
        double time = input.nextDouble();

        System.out.println(compoundInterest(principle, rate, time));

    }
    static double compoundInterest(double principle,double rate,double time) {
        return principle * Math.pow((1 + rate/100),time) - principle;
    }
}
