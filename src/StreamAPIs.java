import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIs {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 7, 3, 2, 6);
        Stream<Integer> s = list.stream();
        int sum = 0;
        for (int n : list) {
            if (n % 2 == 0) {
                n = n * 2;
                sum += n;
            }
        }
//        System.out.println(list);
//        System.out.println(sum);
//        list.forEach(n-> System.out.println(n));
//        Consumer<Integer> con=new Consumer<Integer>() {
//            public void accept(Integer n) {
//                System.out.println(n);
//            }
//        };
//        list.forEach(con);
//      s.forEach(n-> System.out.println(n));
//      s.forEach(n-> System.out.println(n));  // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        Stream<Integer> s2 = s.filter(n -> n % 2 == 0);
//       s2.forEach(n-> System.out.println(n));
        Stream<Integer> s3 = s2.map(n -> n * 2);
//       s3.forEach(n-> System.out.println(n));
        int res = s3.reduce(0, (c, e) -> c + e);
        System.out.println(res);
        Predicate<Integer> p =n->n%2==0;  // to replace the operation in filter method
        Function<Integer,Integer> f = n->n*2;  // to replace the operation in map method

        int ans = list.stream().filter(p).map(f).reduce(0, (c, e) -> c + e);
        System.out.println(ans);
    }
}
