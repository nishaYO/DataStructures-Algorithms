import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        //calculate distance between two points assuming both are on graph
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = in.nextInt();
        System.out.print("Enter y1: ");
        int y1 = in.nextInt();
        System.out.print("Enter x2: ");
        int x2 = in.nextInt();
        System.out.print("Enter y2: ");
        int y2 = in.nextInt();
        double distance = Math.sqrt(Math.pow(y1-y2,2) + Math.pow(x1-x2, 2));//using pythagoras theorem
        System.out.println(distance +" is the distance between the two points.");
    }
}
