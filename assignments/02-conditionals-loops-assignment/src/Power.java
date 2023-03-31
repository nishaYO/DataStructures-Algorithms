import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        //calculate the power of a number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base value here :");
        int base = in.nextInt();
        System.out.print("Enter the exponent value here :");
        int expo = in.nextInt();
        for (int i = 0; i < expo; i++){
            base*=base;
        }
        System.out.println("The answer is "+ base);
    }
}
