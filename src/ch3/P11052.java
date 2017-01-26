package ch3;

import java.util.Scanner;

/**
 * 붕어빵 판매하기
 * https://www.acmicpc.net/problem/11052
 *
 * @author HyungTae Lim
 * @since 2016. 12. 9.
 */
public class P11052 {
    static int[] DP;
    static int[] P;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        P = new int[s.nextInt() + 1];
        DP = new int[P.length];
        for (int i = 1; i < P.length; i++) {
            P[i] = s.nextInt();
        }
        System.out.println(maxMoney());
    }

    private static int maxMoney() {
        for (int i = 1; i < DP.length; i++) {
            for (int j = 1; j <= i; j++) {
                DP[i] = Math.max(DP[i], DP[i - j] + P[j]);
            }
        }
        return DP[DP.length - 1];
    }
}
