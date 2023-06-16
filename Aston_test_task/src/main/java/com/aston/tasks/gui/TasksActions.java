package com.aston.tasks.gui;

import exceptions.EmptyInputException;

import java.util.Arrays;

public class TasksActions {
    public static String sayHello(String input) {
        try {
            String number = input.trim();
            if (number.isEmpty()) throw new EmptyInputException();
            return Integer.parseInt(number) > 7 ? "Привет!" : "";
        }
        catch (NumberFormatException e) {
            return "Проверьте введённые данные";
        }
        catch (EmptyInputException e) {
            return e.getMessage();
        }
    }

    public static String helloViacheslav(String input) {
        try {
            String name = input.trim();
            if(name.isEmpty()) throw new EmptyInputException();
        }
        catch (EmptyInputException e) {
            return e.getMessage();
        }
        return input.equals("Вячеслав") ? "Привет, Вячеслав" : "Нет такого имени";
    }

    public static String getArrayDivisibleBy3(String input) {
        try {
            if(input.trim().isEmpty()) throw new EmptyInputException();
            int[] array = Arrays.stream(input.trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            StringBuilder sb = new StringBuilder();
            Arrays.stream(array).forEach(x-> {
                if (x % 3 == 0) {
                    sb.append(x);
                    sb.append(" ");
                }
            });
            return sb.toString().trim();
        }
        catch (NumberFormatException e) {
            return "Проверьте введённые данные";
        }
        catch (EmptyInputException e) {
            return e.getMessage();
        }
    }
}
