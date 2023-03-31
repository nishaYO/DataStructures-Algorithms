import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        /*
        hours of electricity used
        price to pay per hour = 70 rupees assume
         */

        Scanner in = new Scanner(System.in);
        System.out.print("How many hours was the electricity used? ");
        int hours = in.nextInt();
        int price = 70;
        int total = hours*price;
        System.out.println(total + " rupees is the amount of electiricity bill.");



    }
}
