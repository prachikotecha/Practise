interface Factorial{
    int fact(int a);
}

public class LambdaFactorial {
    public static void main(String[] args) {
        Factorial obj=(int a)->
        {
            int f=1;
            for(int i=1;i<=a;i++){    
                f=f*i; 
            }
            return f;
        };
        System.out.println(obj.fact(5));
    }
}
