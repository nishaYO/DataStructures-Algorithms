import java.util.Scanner;

public class PrimeNumbers {
    /*
    Write a function that returns all prime numbers between two given numbers.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("The prime numbers between the given numbers are ");
        prime(a,b);
    }

    static void prime(int a, int b){

        for (int i = a; i <= b; i++) {
            for (int j = 2; j <= i/2; j++) {
                if(i%j==0){
                   System.out.print(i+ " ");
                   break;
                }
            }
        }
    }
}
