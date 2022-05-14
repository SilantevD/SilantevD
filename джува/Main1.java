package com.company;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


class main {
    private static final int n = 15;

    public static void main(String[] args) {
        int[] x = new Random().ints(n, -10, 11).toArray();
        int[] y = new int[n];
        int[] p = new int[n];
        Scanner s= new Scanner(System.in);
        System.out.println("Введите значение: ");
        final int z = s.nextInt();
        int size_b = 0;
        for (int e : x)
            if (e < z)
                y[size_b++] = e;


        int[] c = Arrays.copyOf(y, size_b);

        System.out.println("Стандартный массив: ");
        print_array(x);
        System.out.println("Измененный массив: ");
        print_array(c);

    }

    private static void print_array(int[] a) {
        Arrays.stream(a).forEach(e -> System.out.printf("% 4d", e));
        System.out.println();
    }
}