import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {

        /*
        batting average = total hits/total at-bats
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total number of hits here: ");
        double hits = in.nextInt();
        System.out.print("Enter the total number of at-bats here: ");
        double atBats = in.nextInt();
        double avg = hits/atBats;
        System.out.println("The batting average is " + (float)avg);

    }
}
