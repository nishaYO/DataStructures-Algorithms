import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(maximum(a, b, c));
        System.out.println(minimum(a, b, c));
    }

    static int maximum(int a, int b, int c){
        int max = a;
        if(b>a && b>c){
            max = b;
        } else if (c>a && c>b){
            max = c;
        }

        return max;
    }

    static int minimum(int a, int b, int c){
        int min = a;
        if(b<a && b<c){
            min = b;
        } else if (c<a && c<b){
            min = c;
        }

        return min;
    }
}