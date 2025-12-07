import java.util.*;

/**
 * Write a description of class tutorial5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial5
{
    public static void main (String[] args)
    {
         Scanner input = new Scanner(System.in);
         System.out.println("Give a number");
         int n = input.nextInt();
         int sum  = 0;
         for (int i=0;  i<=n; i++)
         {
             sum = sum + i;
             
         }
         System.out.println("The sum:"+sum);
    }
}