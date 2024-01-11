interface Coding{
    void code();
}
class A implements Coding
{
    public void code()
    {
        System.out.println("Happy Coding!");
    }
}
class B implements Coding
{
    public void code()
    {
        System.out.println("Coding is Interesting!");
    }
}

public class Interface {
    public static void main(String[] args) {
        Coding cod=new A();
        Coding obj=new B();
        cod.code();
        obj.code();


    }
}
