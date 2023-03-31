
import java.util.Scanner;

public class SimpleInterest {
    public SimpleInterest() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int r = in.nextInt();
        int t = in.nextInt();
        int interest = p * r * t / 100;
        System.out.println(interest);
    }
}
