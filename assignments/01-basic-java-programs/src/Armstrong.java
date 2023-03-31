import java.util.Scanner;

public class Armstrong {
    public Armstrong() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for(int num = a; num <= b; ++num) {
            int len = 0;

            int n;
            for(n = num; n != 0; ++len) {
                n /= 10;
            }

            n = num;
            int ans = 0;

            for(int l = len; l > 0; --l) {
                ans = (int)((double)ans + Math.pow((double)(n % 10), (double)len));
                n /= 10;
            }

            if (ans == num) {
                System.out.println("" + num + " is an armstrong number between " + a + " and " + b + ".");
                break;
            }
        }

    }
}
