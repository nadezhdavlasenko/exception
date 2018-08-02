package com.company;

public class StackOverflowErrorGenerator {
    static void generate() {
        try {
            recursiveCall();
        } catch (StackOverflowError e) {
            System.out.println(e + " was cathed");
        }
    }

    private static void recursiveCall() {
        recursiveCall();
    }
}
