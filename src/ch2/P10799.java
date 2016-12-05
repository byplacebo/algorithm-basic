package ch2;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author HyungTae Lim
 * @since 2016. 12. 5.
 */
public class P10799 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(countFaster(s.next()));
    }

    private static int count(String next) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < next.length(); i++) {
            if (next.charAt(i) == '(') {
                stack.push(i);
            } else {
                int before = stack.pop();
                if (i == before + 1) {
                    count += stack.size();
                } else {
                    count += 1;
                }
            }
        }
        return count;
    }

    private static int countFaster(String next) {
        int count = 0, left = 0;

        for (int i = 0; i < next.length(); i++) {
            if (next.charAt(i) == '(') {
                left += 1;
            } else {
                left -= 1;
                if(next.charAt(i-1) == '(') {
                    count += left;
                } else {
                    count += 1;
                }
            }
        }
        return count;
    }
}
