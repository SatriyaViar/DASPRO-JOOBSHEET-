import java.util.Scanner;

/**
 * ForMultiples23
 */
public class ForMultiples23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Multiple; int sum = 0; int counter = 0;

        System.out.print("Input the Multiple = ");
        Multiple = input.nextInt();

        for (int i = 1; i<= 50; i++){
            if (i%Multiple == 0) {
                sum = sum + i;
                counter++;
                System.out.println(i + "-");
            }
        }
        System.out.printf("There are %d numbers that are multiple of %d in range 1 to 5. \n", counter , Multiple);
        System.out.printf("The sum from multiples of %d in range 1 s.d. 50 is %d. \n", Multiple , sum);
    }
}