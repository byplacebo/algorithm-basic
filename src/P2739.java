import java.util.Scanner;

public class P2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        int i = 0;
        while (i++ < 9) {
            System.out.printf("%d * %d = %d\n", c, i, c * i);
        }
    }
}
