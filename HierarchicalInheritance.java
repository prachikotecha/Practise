class Animal
{
    String type;
    Animal()
    {
        this.type="Dog/Cat";
    }   
}
class Dog extends Animal{
    String feature;
    Dog()
    {
        this.feature="Barks";
    }
}
class Cat extends Animal{
    String feature;
    Cat()
    {
        this.feature="Meues";
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        Animal a=new Animal();
        System.out.println(a.type+" "+"both are animals.");
        System.out.println("Dogs"+" "+d.feature);
        System.out.println("Cats"+" "+c.feature);
    }
}
