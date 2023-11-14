import java.util.Scanner;

/**
 * PurchasePrice23
 */
public class PurchasePrice23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price, quantity;
        double discount=0.10, totalPrice, purchasePrice, totalDiscount;
        System.out.print("Input Price: ");
        price=input.nextInt();
        System.out.println("Input Quantity: ");
        quantity=input.nextInt();
        totalPrice=price*quantity;
        totalDiscount=totalPrice*discount;
        purchasePrice=totalPrice-totalDiscount;
        System.out.println("total Discount: " + totalDiscount);
        System.out.println("Final Purchase Price: " + purchasePrice);
    }
}
