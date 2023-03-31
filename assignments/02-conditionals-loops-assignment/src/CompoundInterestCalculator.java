import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal/initial amount: ");
        double p  = in.nextInt();
        System.out.print("Enter the rate of interest: ");
        double r = in.nextInt();
        System.out.print("Enter the number of years: ");
        double t = in.nextInt();
        double ci = (p*(Math.pow(1+(r/100), t)))-p;
        System.out.println("The CI is " + (float)ci);
    }
}
