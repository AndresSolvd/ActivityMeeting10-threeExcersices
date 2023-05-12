package com.solvd;

import java.util.Arrays;

public class Split {

    public static void main(String[] args) {

        String str = "asdfGGkjcl";

        splitFor(str);
        splitStream(str);
        splitString(str);
    }

    public static void splitFor(String str) {
        //for loop solution
        System.out.println("\nLoop solution");
        int coordinate = 0;
        for (int i = 0; i < str.length(); i++) {
            coordinate++;
            if (str.charAt(i) == (str.charAt(i + 1))) {
                break;
            }
        }

        String firstSubString = str.substring(0, coordinate);
        String secondSubString = str.substring(coordinate);

        System.out.println(str + "\n" + firstSubString + "\n" + secondSubString);

        System.out.println("First String Length: " + firstSubString.length() + "\nSecond String Length: " + secondSubString.length());
    }

    public static void splitStream(String str) {
        //stream solution
        System.out.println("\nStream solution");
        Arrays.stream(str.split("(?<=[A-Z])(?=[A-Z])")).forEach(s -> System.out.println("\"" + s +
                "\" String Length: " + s.length()));
    }

    public static void splitString(String str) {
        //String solution
        System.out.println("\nString solution");
        String[] substrings = str.split("(?<=[A-Z])(?=[A-Z])");
        System.out.println("First String Length: " + substrings[0].length() +
                "\nSecond String Length: " + substrings[1].length());
    }
}