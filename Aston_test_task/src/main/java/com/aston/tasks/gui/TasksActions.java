package com.aston.tasks.gui;

import java.util.Arrays;

public class TasksActions {
    public static String sayHello(String number) {
        try {
            return Integer.parseInt(number) > 7 ? "Привет!" : "";
        }
        catch (NumberFormatException e) {
            return "Проверьте введённые данные";
        }
    }

    public static String helloViacheslav(String input) {
        return input.equals("Вячеслав") ? "Привет, Вячеслав" : "Нет такого имени";
    }

    public static String getArrayDivisibleBy3(String input) {
        try {
            int[] array = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            StringBuilder sb = new StringBuilder();
            Arrays.stream(array).forEach(x-> {
                if (x % 3 == 0) {
                    sb.append(x);
                    sb.append(" ");
                }
            });
            return sb.toString();
        }
        catch (NumberFormatException e) {
            return "Проверьте введённые данные";
        }
    }
}
