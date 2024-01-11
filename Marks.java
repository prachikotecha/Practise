class Sports{
    
    float sportmarks;

    Sports()
    {
        sportmarks=80;

    }

}
class Result extends Sports
{
    float m1,m2,m3;  
    
    Result()
    {
        super();
        m1=75;
        m2=90;
        m3=85;
    }
    void calResult()
    {
        float r=m1+m2+m3+sportmarks;
        System.out.println("Gross Salary of "+" " +"is"+" "+r);

        double per=r/4;
        System.out.println("Percentage is "+" " +"is"+" "+per+" "+"%");

    }
    
}

public class Marks{
    public static void main(String[] args)
    {
        Result obj=new Result();
        obj.calResult();
    }
    

}
