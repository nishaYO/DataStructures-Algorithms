package mypackage;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Integer a = num.nextInt();
        Integer b = num.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
