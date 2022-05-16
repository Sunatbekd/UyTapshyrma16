package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Circle.area(a);
        int b = scanner.nextInt();
        Circle.circumference(b);
    }
}
