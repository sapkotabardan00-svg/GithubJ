package Week7.week8;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    private String itemName;
    private double itemPrice;
    private int quantity;
    
    public ShoppingCart (String itemName, double itemPrice, int quantity)
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public int getQuantity()
    {
        return this.quantity;
    }
    
    double calculateTotal()
    {
        double totalPrice = itemPrice * quantity;
        return totalPrice;
    }
    
    double calculateDiscountTotal(double discountPercent)
    {
        double total = calculateTotal();
        double finalTotal = total - (total * (discountPercent/100));
        return total;
    }
     
    void displayCart()
    {
        System.out.println("Item Name:" + this.itemName);
        System.out.println("Item Price:" + this.itemPrice);
        System.out.println("Quantity:" + this.quantity);
    }
    
}