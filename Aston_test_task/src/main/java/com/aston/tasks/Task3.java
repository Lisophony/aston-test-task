package com.aston.tasks;

import java.util.Arrays;

public class Task3 extends BaseTask {
    public static int[] getArray(String[] input) {

        return Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
    }

    public static void printDivisibleBy3() {
        Arrays.stream(getArray(scanner.nextLine().split(" "))).forEach(x-> {
            if (x % 3 == 0) {
                System.out.println(x);
            }
        });
    }
}
