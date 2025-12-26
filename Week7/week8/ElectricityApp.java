package Week7.week8;


/**
 * Write a description of class ElectricityApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityApp
{
    public static void main (String[] args)
    {
        ElectricityBill e1 = new ElectricityBill("Bardan",150);
        e1.displayInfo();
        double bill = e1.calculatorBill();
        System.out.println("Total cost:" + bill);
    }
}