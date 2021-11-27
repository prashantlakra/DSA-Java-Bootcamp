package com.company;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Price Of Product: ");
        double price = input.nextDouble();

        double discount;

        if(price>1000){
            discount = price*0.1;
        }
        else if(price>500){
            discount = price*0.2;
        }
        else{
            discount = price*0.3;
        }

        double total = price-discount;

        System.out.println("Total Price of Product is: "+ total);
        System.out.println("Discount of Product is: "+ discount);
    }
}
