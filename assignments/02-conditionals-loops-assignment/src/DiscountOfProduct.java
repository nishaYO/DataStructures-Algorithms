import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the product MRP: ");
        int price = in.nextInt();
        System.out.print("Enter the discount percent: ");
        int percentage = in.nextInt();
        int discount = (percentage*price)/100;
        System.out.println(discount + " is the discount on your product.");

    }
}
