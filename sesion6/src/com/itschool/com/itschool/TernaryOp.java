package com.itschool.com.itschool;

import java.util.Scanner;

public class TernaryOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("using classic if-elese");
        int x;
        if (number > 10) {
            x=5;
        } else {
            x = 6;
        }
        System.out.println("x is " + x);

        System.out.println("using ternary op");
        int y = number > 10 ? 5 : 6;
        System.out.println("y is " + y );
    }
}
