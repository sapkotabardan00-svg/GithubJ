import java.util.*;

/**
 * Write a description of class seven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class seven
{
    public static void main (String [] args)
    {    int calculation = 0;
        char choice = 'y';
        while (choice == 'y' || choice == 'Y')
        {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        System.out.println("Enter:" +  "\n" + "1 for addition" + "\n" + "2 for subtraction" + "\n" + "3 for multiplication" + "\n" + "4 for divison");
        int c = input.nextInt();
        switch(c)
        {
            case 1:
                calculation= a + b;
                System.out.println(" The sum is "+  calculation);
                break;
            case 2:
                calculation= a - b;
                System.out.println(" The difference is "+  calculation);
                break;
            case 3:
                calculation= a * b;
                System.out.println(" The product is "+  calculation);
                break;
            case 4:
                calculation= a / b;
                System.out.println(" The quotient is "+  calculation);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("Enter 'y' or 'Y' to continue");
        choice = input.next().charAt(0);
    }
}
}