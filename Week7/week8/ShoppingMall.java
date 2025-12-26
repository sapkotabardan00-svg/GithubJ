package Week7.week8;


/**
 * Write a description of class ShoppingMall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingMall
{
    public static void main (String[] args)
    {
        ShoppingCart s1 = new ShoppingCart("Iphone",200000.00,1);
        s1.displayCart();
        double total = s1.calculateTotal();
        double Dtotal = s1.calculateDiscountTotal(10);
        System.out.println("Total Price:" + total);
        System.out.println("Total price after discount:" + Dtotal);
        
        
    }
}