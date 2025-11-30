import java.util.*;

/**
 * Write a description of class q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q4
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        if (num%3==0 && num%5==0) 
        {
            System.out.println("Both the numbers are divisible by 3 & 5");
        }
        else{
        System.out.println("Both the numbers are not divisible by 3 & 5");
    }
    }
}