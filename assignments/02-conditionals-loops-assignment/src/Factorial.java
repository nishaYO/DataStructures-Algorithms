import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //factorial of n
        int f = 1;
        while(n>0){
            f = f*n;
            n--;
        }
        System.out.println(f);

    }
}