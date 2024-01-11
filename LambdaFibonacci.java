interface Fibonacci{
    void fb();
}   

public class LambdaFibonacci {
    public static void main(String[] args) {
        Fibonacci obj=()->
        {
            int n1=0,n2=1,n3,a=10;
            System.out.print(n1+" "+n2);
            for(int i=2;i<a;++i){
                n3=n1+n2;
                System.out.print(" "+n3);            
                n1=n2;    
                n2=n3;    
            }    
        };
       obj.fb(); 
    }
}
