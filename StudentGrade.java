import java.util.Scanner;

public class StudentGrade 
{
    String stName;
    int rNo;
    float per;
    Scanner sc=new Scanner(System.in);

    public StudentGrade()
    {
        System.out.println("Enter your name: ");
        stName=sc.next();
        System.out.println("Enter your roll no: ");
        rNo=sc.nextInt();
        System.out.println("Enter your percentage: ");
        per=sc.nextFloat();

        System.out.println("Student Name: "+stName);
        System.out.println("Student Roll Number: "+rNo);
        System.out.println("Student Percentage: "+per);


    }

    public void checkGrade(){
        if(per>=70)
        {
            System.out.println("Pass with distinction!");

        }
        else if(per>=60)
        {
            System.out.println("Pass with First Class!");
        }
        else if(per>=50)
        {
            System.out.println("Pass with Second Class!");
        }
        else if(per>=40)
        {
            System.out.println("Pass with Pass Class!");
        }
        else{
            System.out.println("Fail!");
        }
    }

    public static void main(String args[])
    {
        StudentGrade sg=new StudentGrade();
        sg.checkGrade();

    }
}