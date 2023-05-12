package com.solvd;

public class Pairs {
    public static void main(String[] ars) {
        int[] thing = {3, 1, 8};

        pairs(thing);
    }

    public static void pairs(int[] thing) {
        String[] results = new String[thing.length];

        for (int i = 0; i < thing.length; i++) {
            for (int j = i; j < thing.length; j++) {
                results[i] = "[" + thing[i] + "," + thing[j] + "]";
                System.out.println(results[i]);
            }
        }
    }
}
