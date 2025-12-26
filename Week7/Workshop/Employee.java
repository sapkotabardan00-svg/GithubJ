package Week7.Workshop;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    String id;
    String name;
    int salary;
     
    void details()
    {
        System.out.println("Id of employee" +id);
        System.out.println("Name of employee" +name);
        System.out.println("Salary of Employee" + salary);
    }
}