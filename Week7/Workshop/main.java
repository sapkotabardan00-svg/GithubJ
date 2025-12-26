package Week7.Workshop;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main (String[] args)
    {
        Book a1 = new Book();
        a1.title = "Mathematics";
        a1.author = "Aabash" ;
        a1.price = 650;
        System.out.println(a1.title);
        System.out.println(a1.author);
        System.out.println(a1.price);
            
        
        Book a2 = new Book();
        a2.title = "Chemistry";
        a2.author = "Prajwal jeff";
        a2.price = 580;
        System.out.println(a2.title);
        System.out.println(a2.author);
        System.out.println(a2.price);
        
        Rectangle b1 = new Rectangle();
        b1.length = 10;
        b1.breadth = 12;
        b1.area();
        System.out.println(b1.length);
        System.out.println(b1.breadth);
        
        Rectangle b2 = new Rectangle();
        b2.length = 11;
        b2.breadth = 12;
        b2.area();
        System.out.println(b2.length);
        System.out.println(b2.breadth);
        
        Employee e1 = new Employee();
        e1.id = "np01";
        e1.name = "Ramesh";
        e1.salary = 30000;
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.salary);
        
        Employee e2 = new Employee();
        e2.id = "np02";
        e2.name = "Himesh";
        e2.salary = 32000;
        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(e2.salary);
        
        Employee e3 = new Employee();
        e3.id = "np03";
        e3.name = "Suresh";
        e3.salary = 28000;
        System.out.println(e3.id);
        System.out.println(e3.name);
        System.out.println(e3.salary);
        
        if(e1.salary>e2.salary && e1.salary>e3.salary)
        {
            System.out.println("Employee with high salary");
            e1.details();
        
        }
        else if(e2.salary>e3.salary && e2.salary>e1.salary)
        {
            System.out.println("Employee with high salary");
            e2.details();
        
        }
        else
        {
            System.out.println("Employee with high salary");
            e3.details();
        }
        
        
        Laptop l1 = new Laptop("Linux",8,50000);
        l1.checkRAM();
        Laptop l2 = new Laptop("Dell",16,90000);
        l2.checkRAM();
        Laptop l3 = new Laptop("Linux",18,120000);
        l3.checkRAM();
        
        Mobile m1 = new Mobile ("Iphone", 150000);
        m1.isAffordable();
        Mobile m2 = new Mobile ("Redmi", 24000);
        m2.isAffordable();
        Mobile m3 = new Mobile ("Mi",32000);
        m3.isAffordable();
        
        Result re1 = new Result (89,57,83);
        Result re2 = new Result (56,90,78);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}