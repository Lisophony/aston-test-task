package org.example;

import java.util.Arrays;

public class Task3 extends BaseTask {
    private static int[] getArray() {
        String[] input = scanner.nextLine().split(" ");
        return Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
    }

    public static void printDivisibleBy3() {
        Arrays.stream(getArray()).forEach(x-> {
            if (x % 3 == 0) {
                System.out.println(x);
            }});
    }
}
