public class Ex13 {
    public static void main(String[] args) {
        int s = 1000;

        for (int nr1 = 0; nr1 <= s; nr1 += 17) {
            for (int nr2 = 0; nr2 <= s; nr2 += 19) {
                if (nr1 + nr2 == s) {
                    System.out.println( + nr1 + " " + nr2 );
                }
            }
        }
    }
}
