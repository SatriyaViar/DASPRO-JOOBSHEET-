import java.util.Scanner;
/**
 * Triangle23
 */
public class Triangle23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, height;
        float area;
        System.out.print("Input Base: ");
        base=sc.nextInt();
        System.out.print("Input Height: ");
        height = sc.nextInt();
        area = base * height / 2;
        System.out.println("Area of the triangle " + area); 
    }
} 