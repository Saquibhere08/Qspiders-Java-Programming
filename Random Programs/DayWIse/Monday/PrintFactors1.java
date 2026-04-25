package Monday;
//
public class PrintFactors1 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        while (a <= b) {
            int n = a;
            int j = 1;

            while (j <= n) {
                if (n % j == 0) {
                    System.out.print(j + " ");
                }
                j++;
            }

            System.out.println(); // move to next line for next number
            a++;
        }
    }
}