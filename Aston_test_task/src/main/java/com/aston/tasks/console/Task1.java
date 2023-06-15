package com.aston.tasks.console;

public class Task1 extends BaseTask {
    public static void sayHello() {
        System.out.println("Введите число");
        int number = Integer.parseInt(scanner.nextLine());
        if(number > 7) System.out.println("Привет!");
    }
}
