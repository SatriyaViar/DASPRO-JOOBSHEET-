import java.util.Scanner;

/**
 * Selection1jStudent23
 */
public class Selection1jStudent23 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        //System.out.print("Input a number: ");
        //int number = input05.nextInt();

        //if (number%2 == 0) {
        //    System.out.println(number+ " is an even number! ");
        //} else {
        //    System.out.println(number+ " is an odd number! ");
        //} 
        
        System.out.print("input a Number: ");
        int Number = input05.nextInt();
        String Say = Number >= 15 ? "Anda Remidi" : "Anda Tidak Remidi";
        System.out.println(Say);
    }   
}    