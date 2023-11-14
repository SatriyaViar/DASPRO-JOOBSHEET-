import java.util.Scanner;

/**
 * Selection2Studint23
 */
public class Selection2Studint23 {

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        System.out.print("Nilai UAS    : ");
        float finalExam = input23.nextFloat();
        System.out.print("Nilai UTS    : ");
        float midExam = input23.nextFloat();
        System.out.print("Nilai KUIS   : ");
        float quiz = input23.nextFloat();
        System.out.print("Nilai Tugas  : ");
        float assigment = input23.nextFloat();

        float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assigment * 0.2F);
        System.out.println(total);
        
        if (total <= 39) {
             String message = total >=39 ? "Retake" : "Pass";
             String letterGrade = "E";
             System.out.println("Final Grade = " + letterGrade + " and the decission is " + message);

        } else if (total <= 50) {
            String letterGrade = "D";
            String message = total >= 50 ? "Retake" : "Pass";
            System.out.println("Final Grade = " + letterGrade + " and the decission is " + message);

        }else if (total <= 60) {
            String letterGrade = "C";
            String message = total >= 60 ? "Retake" : "Pass";
            System.out.println("Final Grade = " + letterGrade + " and the decission is " + message);  

        }else if (total <= 65) {
            String letterGrade = "C+";
            String message = total >= 65 ? "Retake" : "Pass";
            System.out.println("Final Grade = " + letterGrade + " and the decission is " + message);

        }else if (total <= 73) {
            String letterGrade = "B";
            String message = total >= 73 ? "Retake" : "Pass";
            System.out.println("Final Grade = " + letterGrade + " and the decission is " + message);
        }else if (total <= 80) {
            String letterGrade = "B+";
            String message = total >= 80 ? "Retake" : "Pass";
            System.out.println("Final Grade = " + letterGrade + " and the decission is " + message);
        }else if (total <= 100) {
            String letterGrade = "A";
            String message = total >= 100 ? "Retake" : "Pass";
            System.out.println("Final Grade = " + letterGrade + " and the decission is " + message);
        }else{
            System.out.println("Nilai Yang Anda Masukan Salah. Coba Lagi !!!");
        }
            
        
        //String message = total < 65 ? "Retake" : "Pass";
        //System.out.println("Final Grade = " + total + "and the decission is " + message);
    }
}