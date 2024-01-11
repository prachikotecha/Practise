import java.util.Scanner;

class Cal
{
    
    void add(double num1,double num2)
    {
        double add=num1+num2;
        System.out.println("Addition="+" "+add);

    }
    void sub(double num1,double num2)
    {
        double sub=num1-num2;
        System.out.println("Subtraction="+" "+sub);

        
    }
    void mul(double num1,double num2)
    {
        double mul=num1*num2;
        System.out.println("Multiplication="+" "+mul);

        
    }
    void div(double num1,double num2)
    {
        double div=num1/num2;
        System.out.println("Division="+" "+div);
    }
    
}
public class Calculator
{
    public static void main(String[] args) {
        double a1,a2;
        char operator;
        Cal obj=new Cal();
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose an operator: +, -, *, / ");
        operator=sc.next().charAt(0);
        System.out.println("Enter the first number:");
        a1=sc.nextDouble();
        System.out.println("Enter the second number:");
        a2=sc.nextDouble();

        switch (operator) {
            case '+':
                obj.add(a1,a2);
                break;
            case '-':
                obj.sub(a1,a2);
                break;
            case '*':
                obj.mul(a1,a2);
                break;
            case '/':
                obj.div(a1,a2);
                break;
        
            default:
                System.out.println("Incorrect Selection!");
                break;
        }

    }

}
