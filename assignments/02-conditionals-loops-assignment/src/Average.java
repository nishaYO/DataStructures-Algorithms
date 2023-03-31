import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int avg = 0;
        int count = 0;
        int sum = 0;
        while(true){
            int n = in.nextInt();
            sum += n;
            count++;
            System.out.print("Do you want to put more values?(y/n) ");
            String ask = in.next();
            if (ask.equals("y")){
                continue;
            } else if (ask.equals("n")) {
                break;
            }
        }
        avg = sum/count;
        System.out.println(avg);
    }
}
