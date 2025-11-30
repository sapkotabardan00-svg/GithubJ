
/**
 * Write a description of class q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q5
{
    public static void main (String [] args){
        int num = 6;
        
        if (num % 3 == 0)
        {
            if (num % 5 == 0)
            { 
                System.out.println("divisible by both");
            }
             else {
                 System.out.println("Divisible by 3 but not by 5");
             }
            }         
              else if (num%5 == 0)
             {
                 if (num % 3 == 0)
                 {
                 System.out.println("Divisible by both");
             }
              else
              {
                  System.out.println("Divisible by 5 but not by 3");
              }
            }
            else {
                System.out.println("Not diviisble by both");
            }
}
}
