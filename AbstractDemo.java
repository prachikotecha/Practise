abstract class Vehicle
{
    abstract void drive();
    void show()
    {
        System.out.println("In parent show");
    }
}
class Bike extends Vehicle
{
    void drive()
    {
        System.out.println("Running fast...");
    }
}
class Car extends Vehicle
{
    void drive()
    {
        System.out.println("Drive Safely");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Vehicle obj=new Car();
        Vehicle obj1=new Bike();
        obj.drive();
        obj1.drive();

    }
}
