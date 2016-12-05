package ch1;

import java.util.Scanner;

public class P11022 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int idx = 1;
        while (i-- > 0) {
            final int a = s.nextInt();
            final int b = s.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", idx, a, b, a + b);
            idx++;
        }
    }
}