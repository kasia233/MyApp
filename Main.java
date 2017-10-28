package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("podaj m");
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        System.out.println("podaj v");
        double v = scanner.nextDouble();
        System.out.println("podaj r");
        double r = scanner.nextDouble();
        double wynik = m*v*v/r;
        System.out.println("siła dośrodkowa wynosi " + wynik);

    }
}
