package com.company;

import java.util.Random;
import java.util.Arrays;

class main {
    private static final int n = 6;

    public static void main(String[] args) {
        int[] x = new Random().ints(n, -10, 11).toArray();
        int[] y = new int[n];

        int size_b = 0;
        for (int e : x)
            if (e < 0)
                y[size_b++] = e*2;

        int[] c = Arrays.copyOf(y, size_b);
        Arrays.sort(c);
        System.out.println("Массив x: ");
        print_array(x);
        System.out.println("Массив y: ");
        print_array(c);
    }

    private static void print_array(int[] a) {
        Arrays.stream(a).forEach(e -> System.out.printf("% 4d", e));
        System.out.println();
    }
}