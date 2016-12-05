package ch2;

import java.util.Scanner;

public class P9012 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int all = s.nextInt();
        while(all-- > 0) {
            System.out.println(valid(s.next()));
        }
    }

    public static String valid(String string) {
        int cnt = 0;
        for (int i =0; i < string.length() ; i++) {
            if (string.charAt(i) == '(') {
                cnt += 1;
            } else {
                cnt -= 1;
                if (cnt < 0) {
                    return "NO";
                }
            }
        }
        return cnt == 0 ? "YES" : "NO";
    }
}
