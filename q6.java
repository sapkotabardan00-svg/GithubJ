import java.util.*;

/**
 * Write a description of class q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q6
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        float SP;
        System.out.println("Enter the category (A/B/C/D)");
        char category = input.next().charAt(0);
        System.out.println("Enter the marked Price");
        float MP = input.nextFloat();
        if (category=='A' || category=='a')
        {
            SP = MP - (MP * 0.6f);
            System.out.println("The selling price is"+ SP);
        }
        else if (category=='B' || category=='b')
        {
            SP = MP - (MP * 0.4f);
            System.out.println("The selling price is"+ SP);
        }
        else if (category=='C' || category=='c')
        {
            SP = MP - (MP * 0.2f);
            System.out.println("The selling price is"+ SP);
        }
        else if (category=='D'|| category=='d')
        {
            SP = MP - (MP * 0.1f);
            System.out.println("The selling price is" + SP);
        }
        else 
        {
            System.out.println("Invalid Input");
        }
    }
}