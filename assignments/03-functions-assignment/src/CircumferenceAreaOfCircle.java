import java.util.Scanner;

public class CircumferenceAreaOfCircle {
    public static void main(String[] args) {
        //Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float r = in.nextFloat();
        System.out.println("Circumference of the circle is "+circumference(r));
        System.out.println("Circumference of the circle is "+area(r));
    }

    static double area(float r){
        double answer = Math.PI*(Math.pow(r, 2));
        return answer;
    }

    static double circumference(float r){
        double answer = 2*Math.PI*r;
        return answer;
    }
}
