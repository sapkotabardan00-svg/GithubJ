
/**
 * Write a description of class last here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class last
{
    public static void main (String[] args)
    {
        String [][] name = new String[2][3];
        name [0][0] = "Bardan";
        name [0][1] = "Ashimesh";
        name [0][2] = " Aabash";
        for (int i = 0;i<name.length;i++)
        {
            for ( int j  = 0; j< name[i].length;j++)
            {
                if (name[i][j]== null)
                {
                    System.out.print("Empty\t");
                }
                else{
                    System.out.print(name[i][j]);
                }
                System.out.println();
            }
        }
        
    }
}