import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCollections {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(31);
        list.add(73);
        list.add(14);
        list.add(45);
        list.add(22);
        Comparator<Integer> c=new Comparator<Integer>(){

            @Override
            public int compare(Integer i, Integer j) {
               if(i%10>j%10)
                return 1;
               else
                   return -1;
            }
        };

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,c);

    }
}
