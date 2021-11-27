package com.company;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        double marks = input.nextDouble();

        double sum = 0;
        int num = 0;

        while(marks!= -1)
        {
            sum+= marks;
            num++;
            marks = input.nextDouble();
        }
        double average = sum / num;
        System.out.print("Average Marks: "+average);
    }
}
