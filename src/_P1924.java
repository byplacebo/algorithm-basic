import java.util.Scanner;

public class _P1924 {
    public static void main(String[] args) {
        // TODO 틀림
        Scanner s = new Scanner(System.in);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m = s.nextInt();
        int d = s.nextInt();
        int cm = 1;
        int ad = 0;
        while (cm++ != m) {
            ad += days[cm];
        }
        ad += d - 1;
        switch (ad % 7) {
            case 0:
                System.out.println("MON");
                break;
            case 1:
                System.out.println("TUE");
                break;
            case 2:
                System.out.println("WED");
                break;
            case 3:
                System.out.println("THU");
                break;
            case 4:
                System.out.println("FRI");
                break;
            case 5:
                System.out.println("SAT");
                break;
            case 6:
                System.out.println("SUN");
                break;

        }
    }
}
