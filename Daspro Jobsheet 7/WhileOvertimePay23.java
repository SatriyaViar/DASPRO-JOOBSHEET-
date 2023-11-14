import java.util.Scanner;

/**
 * WhileOvertimePay23
 */
public class WhileOvertimePay23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numEmployee; int overtimeHours; 
        double overtimePay = 0; double totalOvertimePay = 0;
        String position;

        System.out.print("Employee number = ");
        numEmployee = input.nextInt();

        int i=0;
        while (i<numEmployee) {
            System.out.print("Position of employe " + (i+1) + "(director, manager, staff) = ");
            position = input.next();
            System.out.print("employee " + (i+1) + " overtime hours = ");
            overtimeHours = input.nextInt();
            i++;

            if (position.equalsIgnoreCase("director")) {
                continue;
            }else if (position.equalsIgnoreCase("manager")) {
                overtimePay=overtimeHours * 100000;
            }else if (position.equalsIgnoreCase("staff")) {
                overtimePay=overtimeHours * 75000;
            }else{
                i--;
                System.out.println("Invalid Position! ");
            }
            totalOvertimePay += overtimePay;
        }
            System.out.println("Total of Overtime Pay = " + totalOvertimePay);
    }
}