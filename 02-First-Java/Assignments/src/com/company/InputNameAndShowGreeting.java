package com.company;

import java.util.Scanner;

public class InputNameAndShowGreeting {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Welcome to the world of programming "+name);
    }
}
