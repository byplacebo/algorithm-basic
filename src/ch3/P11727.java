package ch3;

import java.util.Scanner;

/**
 * 2 x n 타일링 문제 2 <br>
 * https://www.acmicpc.net/problem/11727
 *
 * @author HyungTae Lim
 * @since 2016. 12. 9.
 */
public class P11727 {
    static int[] DP = new int[1001];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int N = s.nextInt();
        int[] DP = new int[N+1];
        DP[0] = 1;
        DP[1] = 1;
        for (int i = 2; i <= N; i++) {
            DP[i] = (DP[i - 1] + 2 * DP[i - 2])%10007;
        }
        System.out.println(DP[N]);
    }

    private static int tiling(int N) {
        if (N < 2) {
            return 1;
        }
        if (DP[N] > 0) {
            return DP[N];
        }
        DP[N] = (tiling(N - 1) + 2 * tiling(N - 2))%10007;
        return DP[N];
    }
}
