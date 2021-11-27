package com.company;

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of kwh used: ");
        double kwh = input.nextDouble();

        System.out.print("Enter the cost of the kwh: ");
        double cost = input.nextDouble();

        System.out.print("Enter the number of days used: ");
        int days = input.nextInt();

        double bill;
        if(kwh > 0 && cost > 0 && days > 0){
            bill = kwh * cost;
            bill = bill / days;
            System.out.print("The bill is: " + bill);
        }
        else{
            System.out.print("Invalid input");
        }
    }
}
