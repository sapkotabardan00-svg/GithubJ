
/**
 * Write a description of class four here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class four
{
    public static void main (String[] args)
    {
        for(int i =5; i>=1; i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for (int k = 1;k<=6-i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}