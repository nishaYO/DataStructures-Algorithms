import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //take the string input
        String original = in.next();
        //store last index value of the string
        int len = original.length() - 1;
        //define an empty string to store the reversed string
        String reversed = "";
        while(len>=0){
              // adding last char of input to reversed string
              reversed += original.charAt(len);
              len--;
        }
        //output
        System.out.println("The reversed string is "+ reversed);
    }
}
