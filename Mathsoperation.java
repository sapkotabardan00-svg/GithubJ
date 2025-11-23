import java.util.*;

/**
 * Write a description of class Mathsoperation here.
 *
 * @author (Bardan Sapkota)
 * @version (a version number or a date)
 */
public class Mathsoperation
{ 
    public static void main (String[] args)
    {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the first num");
         int Firstnum = input.nextInt();
         System.out.println("Enter the second num");
         int Nextnum= input.nextInt();
         int sum,Difference,product, quotient;
         
         // using arithmetic operation         
         sum = Firstnum + Nextnum;  //adding two numbers
         Difference = Firstnum - Nextnum;    // Substacting two numbers
         product = Firstnum * Nextnum; //Multiplying two numbers
         quotient = Firstnum/Nextnum;   // Dividing two numbers
         System.out.println ("The sum is:" + sum);
         System.out.println ("The Difference is:" + Difference);
         System.out.println ("The product is:" + product);
         System.out.println ("The quotient is:" + quotient);
         
         // using unary and assignment operator (post-increment and pre-increment operators
         int a = ++Firstnum;//Pre-increment
         int b = Firstnum++;// Post-increment
         int c = --Nextnum;
         int d = Nextnum--;
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         
         //using the Relational operator
         System.out.println(Firstnum < Nextnum);
         System.out.println(Firstnum > Nextnum);
         System.out.println(Nextnum >= Firstnum);
         System.out.println(Nextnum <= Firstnum);
         
         //using Logial operators
         System.out.println ("Enter the age:");
         int age = input.nextInt();
         String candrive = (age>16) ? "You can drive": "You cannot drive";
         System.out.println(candrive); 
    }
}


    