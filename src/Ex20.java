import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int nr = scanner.nextInt();
        int ogl = 0;
        int m = nr;

        while (nr != 0) {
            ogl = ogl * 10 + nr % 10;
            nr = nr / 10;
        }

        if (ogl == m)
            System.out.println("palindrom");
        else
            System.out.println("nu e palindrom");

    
    }
}
