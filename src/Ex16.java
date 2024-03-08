import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numar:");
        int nr = scanner.nextInt();

        afCif(nr);
    }

    public static void afCif(int nr) {        
        while (nr != 0) {
            int cifra = nr % 10; 
            System.out.println(cifra);
            nr /= 10;
        }
    }
}