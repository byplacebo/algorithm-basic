package ch3;

import java.util.Scanner;

/**
 * 2 x n 타일링 문제 <br>
 * https://www.acmicpc.net/problem/11726
 *
 *  @author HyungTae Lim
 * @since 2016. 12. 9.
 */
public class P11726 {
    static int[] D;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int N = s.nextInt();
        D = new int[N+1];
        D[0] = 1;
        D[1] = 1;
        for(int i = 2 ; i <=N ; i++) {
            D[i] = D[i-1] + D[i-2];
            D[i] = D[i]%10007;
        }
        System.out.println(D[N]);
    }

    private static int tiling(int N) {
        if (N < 2) {
            return 1;
        }
        if (D[N] > 0) {
            return D[N];
        }
        D[N] = (tiling(N - 1) + tiling(N - 2))%10007;
        return D[N];
    }
}
