package com.company;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a position number: ");
        int enteredNum = input.nextInt();
        int previousNum = 0;
        int currentIndex = 1;
        int count = 2;

        while (count <= enteredNum) {
            int tempVar = currentIndex;
            currentIndex = currentIndex + previousNum;
            previousNum = tempVar;
            count++;
        }
        System.out.println("Fibonacci number of " +enteredNum+ "th position is: " +currentIndex);
    }
}
