package com.aston.tasks.console;

import exceptions.EmptyInputException;

public class Task1 extends BaseTask {
    public static void sayHello() {
        System.out.println("Введите число");
        try {
            String input = scanner.nextLine().trim();
            if(input.isEmpty()) throw new EmptyInputException();
            if(Integer.parseInt(input) > 7) System.out.println("Привет!");
        }
        catch (NumberFormatException e) {
            System.out.println("Введённые данные не корректны");
            sayHello();
        } catch (EmptyInputException e) {
            System.out.println(e.getMessage());
            sayHello();
        }
    }
}
