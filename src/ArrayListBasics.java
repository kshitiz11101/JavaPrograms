import java.util.ArrayList;
import java.util.Collection;
public class ArrayListBasics {
    public static void main(String[] args) {
        Collection<Integer> nums=new ArrayList<Integer>();  // need to mention the type of values the collection is storing,it considers everything as Object
//        Collection nums=new ArrayList();  // need to mention the type of values the collection is storing,it considers everything as Object
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(9);
//        nums.add("1");  //Compile time error:  incompatible types: java.lang.String cannot be converted to java.lang.Integer if we are using object to access values

        // if we are not specifying the type
        for(Object n:nums){
            System.out.println(n);
        }
//        If we specify the types
//        for(int n:nums){
//            System.out.println(n);
//        }

        System.out.println(nums);

    }
}
