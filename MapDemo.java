import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer ,String > mp=new HashMap<>();
        mp.put(1,"Prachi");
        mp.put(2,"Sachi");
        mp.put(3,"Reet");
        mp.put(4,"Geet");
        //System.out.println(mp);
        Set s=mp.entrySet();
        Iterator itr=s.iterator();
        while (itr.hasNext()) {
            Map.Entry elt=(Map.Entry)itr.next();
            System.out.println(" ");
            System.out.println(elt.getKey()+" "+elt.getValue());

        }
        
    }
}
