package org.example;

import java.util.Scanner;

public class Task1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void sayHello() {
        int number = Integer.parseInt(scanner.nextLine());
        if(number > 7) System.out.println("Привет!");
    }
}
