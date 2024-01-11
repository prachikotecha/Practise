
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> lst=new ArrayList<>();
        lst.add("Prachi");
        lst.add("Sachi");
        lst.add(1,"Sister");
        System.out.println(lst);
        System.out.println(lst.size());
        Iterator<String> itr=lst.iterator();
        while(itr.hasNext())
        {
            System.out.println("*");
            System.out.println(itr.next());
        }


    }
}
