package ch2;

import java.util.Scanner;
import java.util.Stack;

public class P1406 {
    public static void main(String[] args) {
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();
        Scanner sc = new Scanner(System.in);
        final String string = sc.next();
        for (String c : string.split("")) {
            left.push(c);
        }
        int i = sc.nextInt();
        while (i-- > 0) {
            final String s = sc.next();
            if (s.equals("L") && !left.isEmpty()) {
                right.push(left.pop());
            } else if (s.equals("D") && !right.isEmpty()) {
                left.push(right.pop());
            } else if (s.equals("B") && !left.isEmpty()) {
                left.pop();
            } else if (s.equals("P")) {
                left.push(sc.next());
            }
        }
        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        while (!right.isEmpty()) {
            System.out.print(right.pop());
        }
    }
}
