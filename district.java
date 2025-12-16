import java.util.*;

/**
 * Write a description of class district here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class district
{
    public static void main (String[] args)
    {
        String[] name = {"Morang","Kathmandu","Kaski","Sindhuli"};
        int[] num = {1,2,3,4};
        for (int i =0; i<name.length; i++)
        {
            System.out.println(num[i] +"."+ name[i]);
        }
        
        int[] names = new int[4];
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number");
        int num1 = input.nextInt();
        for( int j=0; j<num1; j++)
        {
            System.out.println(j+name[j]);
        }
    }
}