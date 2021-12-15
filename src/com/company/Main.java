package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number:");
        System.out.println("Note: Must be positive. If negative, remove negative and make one factor negative");
        double a = scan.nextDouble();

        for (int i = 1; i < (.5*a); i++){
            if (a%i == 0){
                System.out.print("" + i + ", " + (a/i) + ". Sum: " + (i + (a/i)));
                //Adds difference (might not work, but not sure if that's because of bad online compiler)
                if (i < a%i){
                    System.out.println(". Difference: " + (i - (a/i)));
                } else {
                    System.out.println(". Difference: " + ((a/i) - i));
                }
            }
        }
    }
}