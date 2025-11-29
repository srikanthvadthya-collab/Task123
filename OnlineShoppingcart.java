package task_cognizent;

import java.util.ArrayList;
public class OnlineShoppingcart {
    String ProductName;
    double Price;
    int quantity;
OnlineShoppingcart(String ProductName, double Price, int quantity) {
        this.ProductName = ProductName;
        this.Price = Price;
        this.quantity = quantity;
    }

    double getTotal() {
        return Price * quantity;
    }
}

class ShoppingCart {
    public static void main(String[] args) {

        ArrayList<OnlineShoppingcart> cart = new ArrayList<>();

        cart.add(new OnlineShoppingcart("Mobile", 7000, 1));
        cart.add(new OnlineShoppingcart("Charger", 500, 2));
        cart.add(new OnlineShoppingcart("Earphones", 300, 1));

        double cartTotal = 0;

        for (OnlineShoppingcart p : cart) {
            cartTotal += p.getTotal();
        }

        double gst = cartTotal * 0.18; 
        double discount = 0;

        if (cartTotal > 1000) {
            discount = cartTotal * 0.10; 
        }

        double finalAmount = cartTotal + gst - discount;

               for (OnlineShoppingcart p : cart) {
            System.out.println(p.ProductName + " | Price: " + p.Price +" | Qty: " + p.quantity +
                    " | Total: " + p.getTotal());
        }

        System.out.println("Cart total : " + cartTotal);
        System.out.println("GST (18%)         : " + gst);
        System.out.println("Discount Applied  : " + discount);
        System.out.println("Final Amount      : " + finalAmount);
    }
}