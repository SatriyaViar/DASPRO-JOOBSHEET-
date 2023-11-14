import java.util.Scanner;

/**
 * Selection2Exp223
 */
public class Selection2Exp223 {

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        System.out.print("Input a Angle 1: ");
        int angle1 = input23.nextInt();
        System.out.print("Input a Angle 2: ");
        int angle2 = input23.nextInt();
        System.out.print("Input a Angle 3: ");
        int angle3 = input23.nextInt();
        int totalAngle = angle1 + angle2 + angle3;

        if (totalAngle == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right Triangle");   

            }   if (angle1 == 90 || angle2 == 90 && angle3 == 90 ) {
                    System.out.println("Equilateral Triangle");
                    if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                        System.out.println("isoscelet Triangle");
                    }
            }else{
                System.out.println("Not a right Triangle ");
            }
        } else {
            System.out.println("Not a triangle");   
        }
    }
}