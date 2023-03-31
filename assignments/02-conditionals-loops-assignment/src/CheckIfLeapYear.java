import java.util.Scanner;

public class CheckIfLeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        if (y%4==0){
            if (y%100==0){
                if (y%400==0){
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
            }else {
                System.out.println("true");
            }
        }
    }
}
