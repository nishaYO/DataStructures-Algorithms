import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(3);
        
        //initialization of arrays within the main array
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //input to add elements to the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        //output array list
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(list.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }
}
