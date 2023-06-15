package com.aston.tasks.console;

import exceptions.EmptyInputException;

public class Task2 extends BaseTask{
    public static void helloViacheslav() {
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        try {
            if(name.isEmpty()) throw new EmptyInputException();
            if(name.equals("Вячеслав"))
                System.out.println("Привет, Вячеслав");
            else System.out.println("Нет такого имени");
        }
        catch (EmptyInputException e) {
            System.out.println(e.getMessage());
            helloViacheslav();
        }

    }
}
