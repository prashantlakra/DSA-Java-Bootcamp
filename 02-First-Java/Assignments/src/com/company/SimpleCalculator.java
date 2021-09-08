package com.company;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        float a = input.nextFloat();
        float b = input.nextFloat();

        System.out.print("Enter an operator: ");
        char op = input.next().charAt(0);

        float result = 0;

        if (op == '+') {
            result = a + b;
        }
        else if (op == '-'){
            result = a - b;
        }
        else if (op == '*'){
            result = a * b;
        }
        else if (op == '/'){
            result = a / b;
        }
        else
            System.out.println("Wrong input");

        System.out.println(result);
    }
}
