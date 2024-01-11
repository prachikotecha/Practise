import java.util.Scanner;

public class SortedArray {
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

        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("Sorted array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
