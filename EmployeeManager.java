class Employee{
    int id;
    String name;
    float sal;

    Employee()
    {
        id=101;
        name="Prachi";
        sal=30000;

    }

}
class Manager extends Employee
{
    float bonus;  
    
    Manager()
    {
        super();
        bonus=10000;
    }
    void calSalary()
    {
        float gs=sal+bonus;
        System.out.println("Gross Salary of "+" "+name+" " +"is"+" "+gs);
    }
    
}

public class EmployeeManager{
    public static void main(String[] args)
    {
        Manager obj=new Manager();
        obj.calSalary();
    }
    

}