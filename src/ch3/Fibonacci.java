package ch3;

import java.util.Scanner;

/**
 * @author HyungTae Lim
 * @since 2016. 12. 12.
 */
public class Fibonacci {
    public static int[] ints;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int i = s.nextInt();
        ints = new int[100];
        System.out.println(fibonacci(i));
    }

    private static int fibonacci(int i) {
        if (i <= 1) {
            return i;
        }
        if (ints[i] > 0) {
            return ints[i];
        }
        ints[i] = fibonacci(i - 1) + fibonacci(i - 2);
        return ints[i];
    }
}
