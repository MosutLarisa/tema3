import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n= ");
        int n = scanner.nextInt();

        double s = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ":");
            double nr = scanner.nextDouble();
            s += nr;
        }
        double media = s / n;
        System.out.println("Media aritmetica: " + media);
    }
}
