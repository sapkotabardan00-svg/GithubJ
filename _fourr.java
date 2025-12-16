import java.util.*;

/**
 * Write a description of class _fourr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class _fourr
{
    public static void main (String[] args)
    {
        String[] name = {"Saroj","Sushant","Ujjwal","Rabina","Sandesh"};
        for (int i=0; i<5; i++)
        {
            System.out.println(name[i]);
        }
        System.out.println(name[2]);
        
        name[4] = "Sanchit";
        System.out.println(name[4]);
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the value");
        int i = input.nextInt();
        System.out.println("Enter name");
        String num = input.next();
        
        name[i] = num;
        for (int j=0; j<5; j++)
        {
            System.out.println(name[j]);
        }
    }
}