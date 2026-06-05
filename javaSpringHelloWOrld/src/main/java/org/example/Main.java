package org.example;

public class Main {
    // Fixed: Added public, String[] args, and changed IO to System
    public static void main(String[] args) {
        System.out.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}