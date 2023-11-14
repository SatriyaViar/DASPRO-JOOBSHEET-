import java.util.Scanner;

/**
 * arrayAverageScore23
 */
public class arrayAverageScore23 {

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);

        System.out.print(" Enter the number of student: ");
        int student = sc23.nextInt();
        int [] scoreStudent23 = new int[student];

        double failedStudent23 = 0;
        double passedStudent23 = 0;
        int passed = 0;
        int failed = 0;

        for (int i = 0; i < scoreStudent23.length; i++) {
            System.out.print("Enter the final score " + (i+1) + " : ");
            scoreStudent23[i] = sc23.nextInt();
        }
        for (int i = 0; i < scoreStudent23.length; i++) {
            passedStudent23 += scoreStudent23[i]; 
            if (scoreStudent23[i] > 70) {
                passedStudent23 += scoreStudent23[i];
                passedStudent23 / 70;
            } else {
                failedStudent23 += scoreStudent23[i];
                failed ++;
            }
        }
        double averageStudentpassed = (passed > 0) ? passedStudent23 / passed : 0 ;
        double averageStudentfailed = (failed > 0) ? failedStudent23 / failed : 0 ;

        System.out.println("The average score of studnets who passed is: " + averageStudentpassed);
        System.out.println("The average score of students who failed: " + averageStudentfailed);
    }  
}