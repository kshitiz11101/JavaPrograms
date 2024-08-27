import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetBasics {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(12);
        set.add(9);
        set.add(21);
        set.add(13);

//        for (int n:set){
//            System.out.println(n);
//        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
