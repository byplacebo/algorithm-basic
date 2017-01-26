package ch3;

import java.util.Scanner;

/**
 * 1로 만들기 <br>
 * https://www.acmicpc.net/problem/1463
 *
 * @author HyungTae Lim
 * @since 2016. 12. 9.
 */
public class P1463 {
    public static int[] DN;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int n = s.nextInt();
        DN = new int[n + 1];
        System.out.println(goBottomUp(n));
    }

    private static int go(int N) {
        if (N == 1) {
            return 0;
        }
        if (DN[N] > 0) {
            return DN[N];
        }

        DN[N] = go(N - 1) + 1;

        if (N % 2 == 0) {
            final int i = go(N / 2) + 1;
            if (i < DN[N]) {
                DN[N] = i;
            }
        }
        if (N % 3 == 0) {
            final int i = go(N / 3) + 1;
            if (i < DN[N]) {
                DN[N] = i;
            }
        }
        return DN[N];
    }

    private static int goBottomUp(int N) {
        // DN[0] = 0;
        // DN[1] = 0;
        for (int i = 2; i <= N; i++) {
            DN[i] = DN[i - 1] + 1;
            if (N % 2 == 0 && DN[i] > DN[i / 2] + 1) {
                DN[i] = DN[i / 2] + 1;
            }
            if (N % 3 == 0 && DN[i] > DN[i / 3] + 1) {
                DN[i] = DN[i / 3] + 1;
            }
        }
        return DN[N];
    }
}
