import java.io.*;

class ReadFile
{
    File f;
    ReadFile()
    {
        f=new File("/Users/prachikotecha/Vinsys/Practise/Abc.txt");
    }
    public void display()
    {
        String s=" ";
        try{
            FileInputStream fin=new FileInputStream(f);
            while (true) {
                int i=fin.read();
                s=s+(char)i;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(s);
    }
}
public class Java {
    public static void main(String[] args) {
        ReadFile rf=new ReadFile();
        rf.display();
    }
}
