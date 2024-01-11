class Vehicle
{
    String brand;
    Vehicle()
    {
        this.brand="Tata";
    }
}
class Car extends Vehicle
{
    String name;
    Car()
    {
        this.name="Nexon";
    }
}
class Evehicle extends Car
{
    float avg;
    Evehicle()
    {
        this.avg=18;
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Evehicle o=new Evehicle();
        System.out.println(o.brand+" "+o.name+" "+o.avg);
        
    }
}
