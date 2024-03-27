package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    
    public static int addPositiveNumber(int a, int b){
        if (a > 0 && b > 0 ) {
            return a + b;
        } else {
            return 0;
        }
    }
    
}