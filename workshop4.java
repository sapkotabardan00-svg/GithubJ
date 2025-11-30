import java.util.*;

/**
 * Write a description of class workshop4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop4
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter your marks");
        int marks = input.nextInt();
        if (marks >= 40)
        {
            System.out.println ("You are pass");
            
        }
          else 
          {
              System.out.println ("You are fail ");
          }
    }
}