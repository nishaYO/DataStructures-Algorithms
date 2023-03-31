import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //one dimensional array
        int arr[] = new int[5]; //an array that stores upto 5 elements of integer datatype

        //asking for input values for the array from the user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }


        //printing the array elements using index
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }


        //printing the array using toString method
        System.out.println(Arrays.toString(arr));
    }
}