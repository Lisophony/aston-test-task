package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    private static Scanner scanner;

    private static int[] getArray() {
        scanner = new Scanner(System.in);
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
