abstract class Bank{
    abstract int rateOfInterest();
    void show()
    {
        System.out.println("Rate of interest is:2");
    }
}
class SBI extends Bank
{
    int rateOfInterest()
    {
        int rate=3;
        System.out.println("Our rate of interest is"+rate);
        return rate;
    }
}
class ICICI extends Bank
{
    int rateOfInterest()
    {
        int r=5;
        System.out.println("Rate of interest is"+r);
        return r;
    }
}

public class AbstractBank {
    public static void main(String[] args) {
        Bank b1=new SBI();
        Bank b2=new ICICI();
        b1.rateOfInterest();
        b2.rateOfInterest();

    }
    
}
