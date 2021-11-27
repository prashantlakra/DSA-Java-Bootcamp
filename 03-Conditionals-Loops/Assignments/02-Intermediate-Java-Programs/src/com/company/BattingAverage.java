package com.company;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of runs: ");
        int runs = input.nextInt();

        System.out.print("Enter the number of matches: ");
        int matches = input.nextInt();

        System.out.print("Enter the number of not-out matches: ");
        int notOut = input.nextInt();

        double outmatches = matches - notOut;
        double battingAverage = runs / outmatches;

        System.out.print("Batting Average = "+battingAverage);
    }
}
