package ch1;

import java.util.Scanner;

public class P10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        while (i-- > 0) {
            System.out.println(s.nextInt() + s.nextInt());
        }
    }
}
