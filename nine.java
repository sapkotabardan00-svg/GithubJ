import java.util.*;

/**
 * Write a description of class nine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nine
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a positive number");
        int num = input.nextInt();
        int rev =0;
        while (num>0)
        {
            int rem;
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}