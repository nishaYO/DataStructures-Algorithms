
import java.util.Scanner;

public class Fibo {
    public Fibo() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int ans = fibonacci(n, a, b);
        System.out.println(ans);
    }

    static int fibonacci(int num, int a, int b) {
        for(int i = 0; i < num; ++i) {
            int temp = b;
            b += a;
            a = temp;
        }

        return b;
    }
}
