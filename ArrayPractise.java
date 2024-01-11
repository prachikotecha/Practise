import java.util.Scanner;

public class ArrayPractise {
    public static void main(String args[])
    {
        int max[];
        max=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        for (int i=0;i<5;i++)
        {
            max[i]=sc.nextInt();
        }                       
        System.out.println("The elements in array are:"+max.length);
        int a=max[0];

        for(int i=1;i<max.length;i++)
        {
            
            if(a<max[i])
            {
            a=max[i];
            
            }
        }
    System.out.println("Max Eelement is:"+a);   
    }
}
