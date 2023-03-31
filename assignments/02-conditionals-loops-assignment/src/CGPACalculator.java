import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of subjects you have: ");
        int n = in.nextInt(); //number of subjects

        double gpa = 0; //graded point average = grades * credit hours (of all subjects)
        double thrs = 0; //total hours = sum of credit hours of all subjects
        double score = 0; // grade converted to score on the scale of 4.0;

       for(int i = 1; i<=n; i++){
            System.out.println("Enter the info of subject " + i);
            System.out.print("Credit hours: ");
            double hrs = in.nextInt();
            System.out.print("Grade(A/B/C/D/F) : ");
            char grade = in.next().charAt(0);

            //converting grade to score
            if(grade == 'A'){
                score = 4.0;
            }else if (grade == 'B') {
                score = 3.0;
            }else if (grade == 'C') {
                score = 2.0;
            }else if (grade == 'D') {
                score = 1.0;
            }else if (grade == 'F') {
                score = 0.0;
            }else {
                System.out.println("Invalid grade!");
                break;
            }

            gpa += hrs * score;
            thrs += hrs;
        }
       double cgpa = gpa/thrs;
       System.out.print("Your CGPA is " + (float)cgpa);
    }
}
