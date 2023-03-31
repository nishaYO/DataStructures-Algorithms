import java.util.Scanner;

public class Sum {
    /*
    Write a program to print the sum of negative numbers, sum of positive even numbers
    and the sum of positive odd numbers from a list of numbers (N) entered by the user.
    The list terminates when the user enters a zero.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumNeg = 0;
        int sumPosOdd = 0;
        int sumPosEven = 0;
        int n = in.nextInt();
        while (n!=0){
            if (n<0){
                sumNeg += n;
            }
            else{
                if(n%2 == 0){
                    sumPosEven += n;
                }
                else{
                    sumPosOdd += n;
                }
            }
            n = in.nextInt();
        }
        System.out.println("The sum of all negative numbers entered is " + sumNeg);
        System.out.println("The sum of all positive odd numbers entered is " + sumPosOdd);
        System.out.println("The sum of all positive even numbers entered is " + sumPosEven);
    }
}
