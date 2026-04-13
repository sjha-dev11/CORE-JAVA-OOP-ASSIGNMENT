public class ProductBilling {

    public void calculateBill(Product p1) {
        double total = p1.getPrice();
        System.out.println("Bill for 1 product: $" + total);
    }

    public void calculateBill(Product p1, Product p2) {
        double total = p1.getPrice() + p2.getPrice();
        total = applyDiscount(total, 5); 
        System.out.println("Bill for 2 products (5% discount applied): $" + total);
    }

    public void calculateBill(Product p1, Product p2, Product p3) {
        double total = p1.getPrice() + p2.getPrice() + p3.getPrice();
        total = applyDiscount(total, 10);
        System.out.println("Bill for 3 products (10% discount applied): $" + total);
    }

    private double applyDiscount(double amount, double discountPercentage) {
        double discountAmount = amount * (discountPercentage / 100);
        return amount - discountAmount;
    }
}
/*
Explanation:
This file defines the ProductBilling class, handling the checkout computations.
The core purpose is to show Method Overloading, allowing the same action (calculating a bill) to handle varying numbers of products cleanly.

Methods:
- calculateBill(Product p1): Handles a single product without discounts.
- calculateBill(Product p1, Product p2): Handles two products and applies a 5% discount (Bonus feature).
- calculateBill(Product p1, Product p2, Product p3): Handles three products and applies a 10% discount (Bonus feature).
- applyDiscount(double amount, double percentage): A private helper method used internally to do the math for the discounts.
*/
