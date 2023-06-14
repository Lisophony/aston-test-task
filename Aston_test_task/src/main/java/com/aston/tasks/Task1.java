package com.aston.tasks;

public class Task1 extends BaseTask {
    public static void sayHello() {
        int number = Integer.parseInt(scanner.nextLine());
        if(number > 7) System.out.println("Привет!");
    }
}
