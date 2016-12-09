package ch2;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10808
 *
 * @author HyungTae Lim
 * @since 2016. 12. 5.
 */
public class P10808 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] cnts = new int[26];
        String string = s.next();
        for (int i = 0; i < string.length(); i++) {
            cnts[string.charAt(i)-97] += 1;
        }
        for(int i = 0 ; i < cnts.length ; i++) {
            System.out.print(cnts[i] + " ");
        }
    }
}
