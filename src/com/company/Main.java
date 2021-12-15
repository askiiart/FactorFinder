package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input an integer to be factored:");
        System.out.println("Note: Must be positive. If negative, remove negative and make one factor negative");
        double a = scan.nextDouble();
        System.out.println(factor(a));
    }

    public static String factor(double a){
        String thingtoreturn = "";
        for (int i = 1; i < (.5*a); i++) {
            if (i <= a / i) {
                if (a % i == 0) {
                    thingtoreturn += "" + i + ", " + (a / i) + ". Sum: " + (i + (a / i)) + ". Difference: " + ((a / i) - i) + "\n";
                }
            }
        }
        return thingtoreturn;
    }
}