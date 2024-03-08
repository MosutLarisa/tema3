import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numar:");
        int nr = scanner.nextInt();

        int cifMax = 0;

        while (nr != 0) {
            int c = nr % 10;
            if (c > cifMax) {
            	cifMax = c;
            }
            nr /= 10;
        }

        System.out.println(cifMax);
        }
}
