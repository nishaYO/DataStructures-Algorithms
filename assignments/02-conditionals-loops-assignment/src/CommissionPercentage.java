import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        //calculate commission percentage
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total sales: ");
        int sales = in.nextInt();
        System.out.print("Enter the commission: ");
        int commission = in.nextInt();
        int ans = (100*commission)/sales;
        System.out.println("The commission percentage is "+ ans);
    }
}
