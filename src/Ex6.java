import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n= ");
        int n = scanner.nextInt();

        int s = 0;
        int c = 0;        
        int nr = 1; 
        while (c < n) {
            s += nr;
            nr += 2; 
            c++;
        }
        System.out.println("Suma primelor " + n + " numere impare este: " + s);
    }
}
