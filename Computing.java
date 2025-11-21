
/**
 * Write a description of class Computing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Computing
{
    int qty;
    static int rrt;
  public static void main (String[] args){
      int age=18;
      System.out.println(age);
      System.out.println(Computing.rrt);
      //Implicit Typecasting
      double dtr=age;
      System.out.println(dtr);
      
      //Explicit Typecasting
      
      double db=10.09;
      int itr=(int)db;
      System.out.println(itr);
      
      //Exceptions in arthimetic
      
      byte b1=10;
      byte b2=11;
      
      byte sum=(byte)(b1+b2);
      System.out.println(sum);
      //Minimun,Maximim,Size,byte
      System.out.println(Byte.MAX_VALUE);
      System.out.println(Byte.MIN_VALUE);
      System.out.println(Byte.SIZE);
      System.out.println(Byte.BYTES);
      
      System.out.println(Short.MAX_VALUE);
      System.out.println(Short.MIN_VALUE);
      System.out.println(Short.SIZE);
      System.out.println(Short.BYTES);
      
      System.out.println(Integer.MAX_VALUE);
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.SIZE);
      System.out.println(Integer.BYTES);
      
      System.out.println(Long.MAX_VALUE);
      System.out.println(Long.MIN_VALUE);
      System.out.println(Long.SIZE);
      System.out.println(Long.BYTES);
      
      System.out.println(Float.MAX_VALUE);
      System.out.println(Float.MIN_VALUE);
      System.out.println(Float.SIZE);
      System.out.println(Float.BYTES);
      
      System.out.println(Double.MAX_VALUE);
      System.out.println(Double.MIN_VALUE);
      System.out.println(Double.SIZE);
      System.out.println(Double.BYTES);
      
      System.out.println(Character.MAX_VALUE);
      System.out.println(Character.MIN_VALUE);
      System.out.println(Character.SIZE);
      System.out.println(Character.BYTES);
      
      
    
    
    }    
}