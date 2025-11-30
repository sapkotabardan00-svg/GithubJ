import java.util.*;

/**
 * Write a description of class q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q2
{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter a number");
        int num = input.nextInt();
        if (num%2==0)
        { 
            System.out.println ("It is even number");
    }
    else
    { 
       System.out.println ("It is odd number");
    }
}
}
