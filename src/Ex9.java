import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n=");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(n + " nu e prim");
            return;
        }
        boolean prim = true;
        
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                prim = false;
                break;
            }
        }

        if (prim) {
            System.out.println("prim");
        } else {
            System.out.println("nu e prim");
        }
    }
}
