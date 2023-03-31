import java.util.Scanner;

public class Palindrome {
    public Palindrome() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int len = str.length();
        int j = len;

        for(int i = 0; i < len; ++i) {
            --j;
            if (j == len / 2) {
                System.out.println("This is a palindrome.");
                break;
            }

            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("This is not a palindrome.");
                break;
            }
        }

    }
}
