package com.company;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sales: ");
        int sales = input.nextInt();

        System.out.print("Enter the commission percentage: ");
        int comm = input.nextInt();

        System.out.print("Enter the number of commission rates: ");
        int rates = input.nextInt();

        System.out.println("Enter the commission rates: ");
        int[] ratesArray = new int[rates];

        for(int i = 0; i < rates; i++){
            ratesArray[i] = input.nextInt();
        }
        // Calculate commission
        int commission = 0;
        for(int i = 0; i < rates; i++){
            if(sales >= ratesArray[i]){
                commission += (sales * comm / 100);
            }
        }
        System.out.print("The commission is: " + commission);
    }
}
