package ch1;

import java.util.Scanner;

public class P10953 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        while (i-- > 0) {
            String[] ab = s.next().split(",");
            System.out.println(Integer.parseInt(ab[0]) + Integer.parseInt(ab[1]));
        }
    }
}