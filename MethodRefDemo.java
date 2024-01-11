
//Method referencing is a way to create reference to functional interface methods.

@FunctionalInterface
interface Demo{
    void show();
}
class MethodDemo{
    //constructor referencing
    public MethodDemo()
    {
        System.out.println("In Constructor");
    }
   //static method referencing
    static void showClass()
    {
        System.out.println("In class Show!");

    }
    //instance method referencing
    void display()
    {
        System.out.println("In Display!");
    }
}

public class MethodRefDemo {
    public static void main(String[] args) {
        Demo ref=MethodDemo::showClass;
        MethodDemo obj=new MethodDemo();
        Demo ref2=obj::display;
        Demo ref3=MethodDemo::new;
        ref.show();
        ref2.show();
        ref3.show();
    }
}
