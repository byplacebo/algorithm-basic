package ch3;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/9095
 *
 * @author HyungTae Lim
 * @since 2016. 12. 9.
 */
public class P9095 {
    static int[] DP;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();

        while (c-- > 0) {
            final int n = s.nextInt();
            DP = new int[21];
            DP[0] = 1;
            DP[1] = 1;
            DP[2] = 2;
            for (int i = 3; i <= n; i++) {
                DP[i] = DP[i - 1] + DP[i - 2] + DP[i - 3];
            }
            System.out.println(DP[n]);
        }
    }

    private static int cases(int N) {
        if (N < 2) {
            return 1;
        } else if (N == 2) {
            return 2;
        }
        if (DP[N] > 0) {
            return DP[N];
        }
        DP[N] = cases(N - 1) + cases(N - 2) + cases(N - 3);
        return DP[N];
    }
}
