import java.time.Year;
import java.util.Scanner;

/**
 * Selection2Exp123
 */
public class Selection2Exp123 {

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        System.out.print("Input a Year: ");
        int year = input23.nextInt();
        
        if (year%4 == 0) {
            if (year%100 != 0) {
                System.out.println("Leap Year");
            }            
        } else {
            System.out.println("Not a leap year");
        }
    }
}