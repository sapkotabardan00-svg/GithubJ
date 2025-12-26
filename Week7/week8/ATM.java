package Week7.week8;


/**
 * Write a description of class ATM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATM
{
    public static void main (String[] args)
    {
        BankAccount b1 = new BankAccount(1,10000,"Bardan");
        b1.deposit();
        b1.withdraw();
        double balance = b1.getBalance();
        System.out.println(balance);
        
        
    }
}