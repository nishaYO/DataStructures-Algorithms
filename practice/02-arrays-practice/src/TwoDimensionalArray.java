import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //creating a 2D array
        int arr[][] = new int[3][3];

        for (int[] row: arr) {
            for (int i = 0; i<row.length; i++){
                row[i] = in.nextInt();
            }
        }

        for (int[] a: arr
             ) {
            System.out.println(Arrays.toString(a));
        }
    }
}
