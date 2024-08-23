public class Practice {
    public static void main(String[] args) {
        System.out.println('a'+1);
        System.out.println('A'+1);
        System.out.println('a'+'A');
        System.out.println('a'+'b');
        System.out.println('a'+3.44);
//        System.out.println(10/0); // Exception in thread "main" java.lang.ArithmeticException
        System.out.println(10/0.0); // +infinity
        System.out.println(-10/0.0);  // -infinity
//        System.out.println(-10/0); // Exception in thread "main" java.lang.ArithmeticException
//        System.out.println(0/0); // Exception in thread "main" java.lang.ArithmeticException
        System.out.println(0.0/0); // NaN
        System.out.println(-0.0/0); // NaN
        System.out.println(0/0.0); // NaN
//        System.out.println(10>NaN);  // cannot find symbol symbol:   variable NaN
        System.out.println(10>Float.NaN);  // false
//        System.out.println(10>Integer.NaN);  // java: cannot find symbol symbol:   variable NaN location: class java.lang.Integer
        System.out.println(10==Float.NaN);  // false
        System.out.println(Float.NaN==Float.NaN); // false
        System.out.println(Integer.NaN==Float.NaN);  // java: cannot find symbol symbol:   variable NaN location: class java.lang.Integer






    }
}
