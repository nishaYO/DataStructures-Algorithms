//Calculate nCr and nPr

import java.util.Scanner;

public class nCrAndnPr {
    public static void main(String[] args) {
        //take input of n and r
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total number of objects: ");
        int n = in.nextInt();
        System.out.print("Enter the selected number of objects (out of total): ");
        int r = in.nextInt();

        //find factorial of n and r
        int factoN = facto(n);
        int factoR = facto(r);
        int factoD = facto(n-r);

        //calculate the nCr (all possible combinations)
        double nCr = factoN/(factoR*(factoD));

        //calculate the nPr (all possible combinations)
        double nPr = factoN/factoD;

        //output
        System.out.println("nCr is "+nCr);
        System.out.println("nPr is "+nPr);
    }

    static int facto(int num){
        int facto = 1;
        for(int i = 1; i <= num; i++){
            facto *= i;
        }
        return facto;

    }

}
