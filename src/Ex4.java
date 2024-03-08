import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primul numar: ");
        int nr1 = scanner.nextInt();
        System.out.print("Al doilea numar: ");
        int nr2 = scanner.nextInt();        
        System.out.print("Al treilea numar: ");
        int nr3 = scanner.nextInt();
        
        int min = nr1;
        if(nr2 < min) {
        	min = nr2;
        }        
        if(nr3 < min) {
        	min = nr3;
        }
        System.out.println("Valoarea minima: " + min);

    }
}
