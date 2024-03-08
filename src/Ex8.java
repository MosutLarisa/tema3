import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n=");
        int n = scanner.nextInt();

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f*=i;
        }
        System.out.println(f);
        }
}
