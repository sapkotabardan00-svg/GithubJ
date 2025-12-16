
/**
 * Write a description of class tutorial6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial6
{
    public static void main (String[] args)
    {
        int [] age;//declearing an array
        age = new int[5];//constructing an array
        System.out.println(age.length);
        
        //firstIndex = 0, lastIndex = age, length-1= 5-1 = 4;
        age[0] =10;
        age[1]=20;
        age[2]=30;
        age[3]=40;
        age[4]=50;
        
        int [] agr= {5,10,15,20,25};//all in one
        System.out.println(agr.length);
        
        System.out.println(agr[0]);
        
        for (int i=0; i< agr.length; i++)
        {
            System.out.println(agr[i]);
        }
          for (int j = agr.length-1; j>=0; j++)
          {
              System.out.println(agr [j]);
          }
        int sum = 0;
        for ( int i = 0; i< agr.length; i++)
        {
            System.out.println(agr [i]);
        }
        //2D array
          
        int [][] matrix = { {1,2,3},{4,5,6}, {7,8,9}, {10,11,12} };
        System.out.println(matrix.length); // length = 4, index= length - 1=3
         for(int  i=0; i<matrix.length;i++)
         {
             for( int j=0; j< matrix[i].length; j++)
             {
                 System.out.println(matrix[i][j]);
             }
             System.out.println();
         }
         
        
    }
}