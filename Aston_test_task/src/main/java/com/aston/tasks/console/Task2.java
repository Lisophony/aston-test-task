package com.aston.tasks.console;

public class Task2 extends BaseTask{
    public static void helloViacheslav() {
        System.out.println("Введите имя");
        if(scanner.nextLine().equals("Вячеслав")) System.out.println("Привет, Вячеслав");
        else System.out.println("Нет такого имени");
    }
}
