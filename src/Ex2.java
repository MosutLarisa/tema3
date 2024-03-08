import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numar: ");
        int nr = scanner.nextInt();

        if (nr == 1) {
            System.out.println("UNU");
        } else if (nr == 2) {
            System.out.println("DOI");
        } else if (nr == 3) {
            System.out.println("TREI");
        } else if (nr == 4) {
            System.out.println("PATRU");
        } else if (nr == 5) {
            System.out.println("CINCI");
        } else {
            System.out.println("INVALID");
        }
    }
}
