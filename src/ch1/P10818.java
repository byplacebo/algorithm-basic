package ch1;

import java.util.Scanner;

public class P10818 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int all = s.nextInt();
        int init = s.nextInt();
        int min = init, max = init;
        while (--all > 0) {
            final int i = s.nextInt();
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        System.out.println(min + " " + max);
    }
}