public class Ex10 {
    public static void main(String[] args) {
        int nr = 1001; 

        while (!estePrim(nr)) {
            nr++;
        }

        System.out.println(nr);
    }

    public static boolean estePrim(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
