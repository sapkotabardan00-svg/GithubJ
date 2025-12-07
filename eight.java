import java.util.*;

/**
 * Write a description of class eight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class eight
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        System.out.println("The multiplication table is ");
        for (int i= 1; i<=10; i++)
        {
            int mul = i *num;
            System.out.println(mul);
        }
    }
}