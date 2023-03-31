import jdk.jshell.Snippet;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int sum = 1; //because we know that every number is divisible by 1.
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("The number is a perfect number");
        }else{
            System.out.println("The number is not a perfect number");
        }
    }
}
