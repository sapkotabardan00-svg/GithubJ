package Week7.Workshop;


/**
 * Write a description of class Laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Laptop
{
    String brand;
    int RAM;
    int price;
    
    public Laptop(String brand, int RAM, int price)
    {
        this.brand = brand;
        this.RAM = RAM;
        this.price = price;
    }
     
    void checkRAM()
    {   
        if (RAM>8)
        {
            System.out.println("The name of the brand is" + brand);
            System.out.println("The RAM of the brand is" + RAM);
            System.out.println("The price of the brand is" + price);
        }
    }
}