package com.solvd;

import java.util.Scanner;

public class StringSum {
    public static void main(String[] args) {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            sum = sum + Character.getNumericValue(str.charAt(i));
            //sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println("The sum is: " + sum);
    }
}