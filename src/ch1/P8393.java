package ch1;

import java.util.Scanner;

public class P8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dest = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= dest; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
