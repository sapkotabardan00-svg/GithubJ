
/**
 * Write a description of class _five here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class _five
{
    public static void main(String[] args)
    {
        int [] score = {10,20,30,40,50};
        for (int i=0; i<5; i++)
        {
            System.out.println(score[i]);
        }
        
        int sum = 0;
        for (int j=0; j<5; j++)
        {
            sum = sum + score[j];
        }
        System.out.println(sum);
        
        int avg = 0;
        avg = sum / score.length;
        System.out.println(avg);
        
        int Highest = score[0];
        int Lowest = score[0];
        for (int k=0; k<score.length; k++)
        {
            if (score[k] > Highest)
            {
                Highest = score[k];
            }
             if( score[k] < Lowest)
             {
                 Lowest = score[k];
             }
        }
        System.out.println(Highest);
        System.out.println(Lowest);
    }
}