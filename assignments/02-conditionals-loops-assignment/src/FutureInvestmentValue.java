import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {

        //take p, r, i and n value from the user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the initial amount: ");
        int p = in.nextInt();
        System.out.print("Enter the rate of interest: ");
        int r = in.nextInt();
        System.out.print("Do you want to consider inflation or not? (y/n): ");
        char askInflation = in.next().charAt(0);
        int i = 0;
        if (askInflation == 'y'){
            System.out.print("What is the average rate of inflation you wanna consider?");
            i = in.nextInt();
        }
        System.out.print("Enter the total number of years: ");
        int n  = in.nextInt();

        //calculate future value of investment
        double fv = p* Math.pow( 1 + ((r-i)/(100.0)), n);
        System.out.println("The future investment value after " + n + " years is " + (float) fv);

    }
}
