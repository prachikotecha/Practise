import java.io.*;

public class DateTime {


static void hourConvert(String s)
{
    int a = (int)s.charAt(1) - '0';
    int b = (int)s.charAt(0) - '0';
    int c = (b * 10 + a % 10);

    if (s.charAt(8) == 'A')
    {
        if (c == 12)
        {
            System.out.println("00");
            for (int i = 2; i <= 7; i++)
                System.out.print(s.charAt(i));
        }
        else
        {
            for (int i = 0; i <= 7; i++)
                System.out.print(s.charAt(i));
        }
    }
 
    else
    {
        if (c == 12)
        {
            System.out.print("12");
            for (int i = 2; i <= 7; i++)
                System.out.print(s.charAt(i));
        }
        else
        {
            c = c + 12;
            System.out.print(c);
            for (int i = 2; i <= 7; i++)
                System.out.print(s.charAt(i));
        }
    }
} 
public static void main (String[] args)
{
    String s = "08:00:30PM";
    hourConvert(s);
}
}
