import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numar:");
        int nr = scanner.nextInt();

        int ogl = 0;

        while (nr != 0) {
            int c = nr % 10;
            ogl = ogl * 10 + c; 
            nr /= 10;
        }

        System.out.println(ogl);
    }
}
