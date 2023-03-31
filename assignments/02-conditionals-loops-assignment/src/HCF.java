import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take two numbers from user
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();

        //find smaller number
        int smaller;
        if(a<b){
             smaller = a;
        }else{
            smaller = b;
        }
        int i = smaller;
        while(i>0){
            if(a% i == 0 && b% i ==0){
                System.out.println("The HCF of "+ a + " and " + b + " is " +  i);
                break;
            }
             i--;
        }

    }
}
