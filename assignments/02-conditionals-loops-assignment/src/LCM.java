import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();

        //find greater
        int greater;
        if(a>b){
            greater = a;
        }else{
            greater = b;
        }
        int i = greater;
        while(true){
            if(i%a==0 && i%b==0){
                System.out.println("LCM is " + i);
                break;
            }
            i++;
        }
    }
}
