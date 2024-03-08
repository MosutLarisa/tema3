import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numar:");
        int nr = scanner.nextInt();

        int cifMin = 9;

        while (nr != 0) {
            int c = nr % 10;
            if (c < cifMin) {
            	cifMin = c;
            }
            nr /= 10;
        }

        System.out.println(cifMin);
        }
}
