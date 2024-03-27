package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int Bills(int times, boolean type){
        if (times <= 0) {
            return 0;
        }
        if (type == true) {   // T - popular table
            if (0 < times && times <= 2) {
                return (times * 70000);
            }
            if (2 < times && times <= 5) {
                return (times * 60000);
            }
            else{
                return (times * 55000);
            }
        } //
        else {
            return times * 100000;
        }
    }
}