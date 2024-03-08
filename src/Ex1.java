import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.println("Numar: ");
        int nr = scanner.nextInt();

        if (nr > 10 || nr < 1) {
            System.out.println("INVALID");
        } else if (nr > 5) {
            System.out.println("ADMIS");
        } else {
            System.out.println("RESPINS");
        }
    }
}
