package Week7.week8;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private int id;
    private String address;
    private long phoneNumber;
    static String collegeName;
    
     
    // setters and getters methods
    
    public Student(String name,int id, String address, long phoneNumber)
    {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phoneNumber =phoneNumber;
    }
    
    public void setname(String name)
    {
        this.name = name;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    // getters and setters for id as well
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getId()
    {
        return this.id;
    }
    
 
    public void setAddress()
    {
        this.address = address;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setPhoneNumber()
    {
        this.phoneNumber = phoneNumber;
    }
    
    public long getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    public void displayINFO()
    {
        System.out.println("Name of student:" + this.name);
        System.out.println("Student.Id:" + this.id);
        System.out.println("Address:" + this.address);
        System.out.println("PhoneNumber:" + this.phoneNumber);
        System.out.println("College Name:" + collegeName);
    }
}