package Week7;


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
        Student s1= new Student();
        s1.collegeID= "np01sp10";
        s1.name = "Bardan";
        s1.age = 19;
        s1.study();
        System.out.println(s1.collegeID);
        System.out.println(s1.name);
        System.out.println(s1.age);
        
        Student s2= new Student();
        s2.collegeID= "np01sp11";
        s2.name = "Aabash";
        s2.age = 20;
        
        System.out.println(s2.collegeID);
        System.out.println(s2.name);
        System.out.println(s2.age);
        
        Car f1 = new Car();
        f1.Brandname = "Hyundai";
        f1.color = "Red";
        f1.price = 2800000;
        f1.drive();
        System.out.println(f1.Brandname);
        System.out.println(f1.color);
        System.out.println(f1.price);
        
        Car f2 = new Car();
        f2.Brandname = "Creta";
        f2.color = "Black";
        f2.price = 6000000;
        f2.breaking();
        System.out.println(f2.Brandname);
        System.out.println(f2.color);
        System.out.println(f2.price);
        
    }
}