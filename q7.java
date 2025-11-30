import java.util.*;

/**
 * Write a description of class q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q7
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println(" Enter the category (A/B/C/D)");
        float SP;
        char category = input.next().charAt(0);
        System.out.println("Enter the marked price :");
        float MP = input.nextFloat();
        switch(category)
        {
            case 'A':
                SP = MP-(MP * 0.6f);
                System.out.println("The selling price is " + SP);
                break;
            case 'B':
                SP = MP-(MP * 0.4f);
                System.out.println("The selling price is " + SP);
                break;
        
            case 'C':
                SP = MP-(MP * 0.2f);
                System.out.println("The selling price is " + SP);
                break;
            case 'D':
                SP = MP-(MP * 0.1f);
                System.out.println("The selling price is " + SP);
                break;
            default : 
                System.out.println("Invalid input");
        
        }
    }
}