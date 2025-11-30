import java.util.*;

/**
 * Write a description of class q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q3
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter a number");
        int number = input.nextInt();
        if (number>0){
            System.out.println ("This is positive integer");
        }
        else if (number<0)
        {
            System.out.println("This is negative integer");
        }
        else {
            System.out.println("This is Zero");
        }
    }
}