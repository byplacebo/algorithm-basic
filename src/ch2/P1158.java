package ch2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * 조세퍼스 문제
 * https://www.acmicpc.net/problem/1158
 *
 * @author HyungTae Lim
 * @since 2016. 12. 5.
 */
public class P1158 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        int peoples = s.nextInt();
        int jp = s.nextInt();
        for (int i = 0; i < peoples; i++) {
            list.add(i + 1);
        }
        StringBuffer result = new StringBuffer("<");
        int now = 0;
        int cnt = 0;
        while (!list.isEmpty()) {
            if(now == list.size()) {
                now = 0;
            }
            if(cnt == jp) {
                result.append(list.get(now));
                if(list.size() != 1) {
                    result.append(", ");
                } else {
                    result.append(">");
                }
                list.remove(now);
                cnt = 0;
            }
        }
        result.append(">");
        System.out.println(result.toString());
    }

    private static void A1() {
        Queue<Integer> queue = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        int peoples = s.nextInt();
        int jp = s.nextInt();
        for (int i = 0; i < peoples; i++) {
            queue.offer(i + 1);
        }
        System.out.print("<");
        int i = 1;
        while (!queue.isEmpty()) {
            if (i == jp) {
                if (queue.size() > 1) {
                    System.out.print(queue.poll() + ", ");
                } else {
                    System.out.print(queue.poll());
                }
                i = 0;
            } else {
                queue.offer(queue.poll());
            }
            i++;
        }
        System.out.println(">");
    }
}
