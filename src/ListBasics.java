import java.util.ArrayList;
import java.util.List;

public class ListBasics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        list.add("6");
        for (int l:list){
//            int num=(Integer)l;
            System.out.println(l);
        }
    }
}
