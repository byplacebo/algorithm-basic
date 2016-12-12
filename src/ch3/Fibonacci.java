package ch3;

import java.util.Scanner;

/**
 * @author HyungTae Lim
 * @since 2016. 12. 12.
 */
public class Fibonacci {
    public static int[] dp;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int i = s.nextInt();
        dp = new int[100];
        System.out.println(fibonacci(i));
    }

    private static int fibonacci(int i) {
        if (i <= 1) {
            return i;
        }
        if (dp[i] > 0) {
            return dp[i];
        }
        dp[i] = fibonacci(i - 1) + fibonacci(i - 2);
        return dp[i];
    }
}
