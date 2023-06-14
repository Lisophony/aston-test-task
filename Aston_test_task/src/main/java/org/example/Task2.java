package org.example;

import java.util.Scanner;

public class Task2 {
    private static Scanner scanner;

    public static void helloViacheslav() {
        scanner = new Scanner(System.in);
        if(scanner.nextLine().equals("Вячеслав")) System.out.println("Привет, Вячеслав");
        else System.out.println("Нет такого имени");
    }
}
