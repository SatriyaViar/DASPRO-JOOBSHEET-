import java.util.Scanner;

/**
 * Selection3Student23
 */
public class Selection3Student23 {

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        double operand1, operand2, result;
        char operator;
        System.out.print("Input operant 1: ");
        operand1 = input23.nextDouble();
        System.out.print("Input operant 2: ");
        operand2 = input23.nextDouble();
        System.out.print("Input operator (+ - * /) : ");
        operator = input23.next().charAt(0);
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + "=" + result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println(operand1 + " * " + operand2 + "=" + result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + "=" + result);
                break;
            case '/':
                result = operand1 / operand2;
                System.out.println(operand1 + " / " + operand2 + "=" + result);
                break;
        }
    }
}