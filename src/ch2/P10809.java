package ch2;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10809
 *
 * @author HyungTae Lim
 * @since 2016. 12. 5.
 */
public class P10809 {
    public static void main(String[] args) {
        int[] loc = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        Scanner s = new Scanner(System.in);
        String string = s.next();
        for(int i = 0 ; i < string.length() ; i++) {
            final int idx = string.charAt(i) - 97;
            if(loc[idx] == -1) {
                loc[idx] = i;
            }
        }
        for(int i = 0 ; i < loc.length ; i++) {
            System.out.print(loc[i] +" ");
        }
    }
}
