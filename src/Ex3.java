import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primul numar: ");
        int nr1 = scanner.nextInt();
        System.out.print("Al doilea numar: ");
        int nr2 = scanner.nextInt();

        if (nr1 % 2 == 0 && nr2 % 2 == 0) {
            int media = (nr1 + nr2) / 2;
            System.out.println("Media aritmetica: " + media);
        } else if (nr1 % 2 == 1 && nr2 % 2 == 1) {
            int produs = nr1 * nr2;
            System.out.println("Produsul: " + produs);
        } else {
            int suma = nr1 + nr2;
            System.out.println("Suma: " + suma);
        }

    }
}
