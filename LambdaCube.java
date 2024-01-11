

interface Cube{
    int cal(int a);
}
/*class ABC implements Cube{
    public int cal(int a){
        return a*a*a;
    }
}*/

public class LambdaCube {
    public static void main(String[] args) {
        Cube obj=(int a)-> 
        {
            return a*a*a;
        };
        System.out.println(obj.cal(4));
    }
}
