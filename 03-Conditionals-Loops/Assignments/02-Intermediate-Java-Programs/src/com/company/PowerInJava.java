package com.company;

import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.print("Enter a power: ");
        int p = input.nextInt();

        int power = 1;

        System.out.print(n+" to the power of "+p+" is = ");
        while(p!=0){
            power *= n;
            p--;
        }
        System.out.print(power);
    }
}
