import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
       List<Integer> lst=Arrays.asList(10,20,3,54,40); 
       System.out.println(lst);
        Stream<Integer> data=lst.stream();
        data.forEach(n->System.out.println(n));
        long cnt=data.count();
       //lst.stream();
       /*for(int i:lst)
       {
            System.out.println(i);
       }*/
    }
}
