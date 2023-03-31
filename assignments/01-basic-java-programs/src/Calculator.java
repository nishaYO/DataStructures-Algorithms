import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String op = in.next();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(calculator(op, a, b));
    }

    static int calculator(String op, int a, int b) {
        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        } else if (op.equals("*")) {
            return a * b;
        } else {
            return op.equals("/") ? a / b : 0;
        }
    }
}
