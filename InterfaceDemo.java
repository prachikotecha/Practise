interface Demo
{
    abstract void show();
}
interface Demo2
{
    abstract void show2();

}
class DemoInterface implements Demo,Demo2{
    public void show()
    {
        System.out.println("In Show");
    }
    public void show2()
    {
        System.out.println("In Class");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        DemoInterface obj=new DemoInterface();
        obj.show();
        obj.show2();
        
    }
}