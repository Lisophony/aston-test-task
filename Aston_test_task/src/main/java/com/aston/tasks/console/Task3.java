package com.aston.tasks.console;

import exceptions.EmptyInputException;

import java.util.Arrays;

public class Task3 extends BaseTask {
    public static int[] getArray(String[] input) {
        return Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
    }

    public static void printDivisibleBy3() {
        System.out.println("Введите массив чисел");
        try {
            String input = scanner.nextLine().trim();
            if(input.isEmpty()) throw new EmptyInputException();
            Arrays.stream(getArray(input.split("\\s+"))).forEach(x-> {
                if (x % 3 == 0) {
                    System.out.println(x);
                }
            });
        }
        catch (NumberFormatException e) {
            System.out.println("Введённые данные некорректны");
            printDivisibleBy3();
        } catch (EmptyInputException e) {
            System.out.println(e.getMessage());
            printDivisibleBy3();
        }
    }
}
