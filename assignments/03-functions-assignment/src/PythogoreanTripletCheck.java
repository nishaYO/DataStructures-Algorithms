import java.util.Scanner;

public class PythogoreanTripletCheck {
    /*
    Write a function to check if a given triplet is a Pythagorean triplet or not.
    (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        System.out.println(check(x,y,z));
    }

    static boolean check(int a, int b, int c){
        double sqA = Math.pow(a,2);
        double sqB = Math.pow(b,2);
        double sqC = Math.pow(c,2);
        if(sqA + sqB == sqC){
            return true;
        } else if (sqA + sqC == sqB) {
            return true;
        } else if (sqB + sqC == sqA) {
            return true;
        }
        return false;
    }
}
