import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Număr: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && estePrim(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean estePrim(int nr) {
        for (int i = 2; i < nr; i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }
}
