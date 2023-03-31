import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        //calculate depreciation value
        /*
        initial value of the product / total life span = depreciation value per year
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the initial/purchase value of the product: ");
        int value = in.nextInt();
        System.out.print("Enter the life span of the product(in years): ");
        int span = in.nextInt();
        int depValue = value/span;
        System.out.println("The depreciation value(per year) of the product is " + depValue);
    }
}
