package com.aston.tasks.console;

import java.util.Arrays;

public class Task3 extends BaseTask {
    public static int[] getArray(String[] input) {
        return Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
    }

    public static void printDivisibleBy3() {
        System.out.println("Введите массив чисел");
        Arrays.stream(getArray(scanner.nextLine().split(" "))).forEach(x-> {
            if (x % 3 == 0) {
                System.out.println(x);
            }
        });
    }
}
