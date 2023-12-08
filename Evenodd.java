import java.util.Scanner;
import java.io.*;
public class Evenodd {
    void evenOdd()
    {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=read.nextInt();
        if(num%2==0)
        System.out.println(num+ "is even number");
        else
        System.out.println(num+ "is odd number");
    }
    public static void main(String args[])
    {
        Evenodd eo=new Evenodd();
        eo.evenOdd();
        


    }

    
}