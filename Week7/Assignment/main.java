package Week7.Assignment;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
     public static void main(String[] Args)
     {
         BankAccount B1 = new BankAccount(1,"Bardan Sapkota",2800000);
        BankAccount B2 = new BankAccount(2,"Anish Magar",3200000);

        System.out.println("For account 1");
        B1.depositMoney();
        B1.withdrawMoney();
        B1.currentBalance();

        System.out.println("For account 2");
        B2.depositMoney();
        B2.withdrawMoney();
        B2.currentBalance();
     }
}