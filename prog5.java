import java.util.*;
public class Revenue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();


        double totalRevenue = calRev(unitPrice, quantity);
        System.out.println("Total revenue: $" + totalRevenue);
    }

    public static double calRev(double unitPrice, int quantity) {
        double discountRate;
        
        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.1; // 10% discount
        } else if (quantity > 120) {
            discountRate = 0.15; // 15% discount
        } else {
            discountRate = 0; // No discount
        }
        
        double discountedPrice = unitPrice * (1 - discountRate);
        return discountedPrice * quantity;
    }
}
