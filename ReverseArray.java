import java.util.Scanner;
public class ReverseArray {
    public static void main(String args[])
    {
        int a[];
        a=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        for (int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }                       
        System.out.println("The elements in array are:"+a.length);

        System.out.println("Reverse of array is:");

        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
            
        }  
    }
}