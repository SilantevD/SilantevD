package com.company;

public class p1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Hello World");
        } else {
            System.out.println("Hello " + args[0]);
        }
    }
}