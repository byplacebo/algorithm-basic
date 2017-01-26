package ch1;

import java.util.Scanner;

public class P11021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int idx = 1;
        while (i-- > 0) {
            System.out.printf("Case #%s: %s\n", idx, s.nextInt() + s.nextInt());
            idx++;
        }
    }
}