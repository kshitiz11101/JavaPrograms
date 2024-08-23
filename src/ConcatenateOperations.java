public class ConcatenateOperations {
    public static void main(String[] args) {
        String s= new String("Hello");
        String x="World";
        int a=10,b=133,c=20;
        float f=20.5F;
        double d=1.222;
        System.out.println(s+x);  // HelloWorld
        System.out.println(s+a);  // Hello10
        System.out.println(s+a+b+c);  // Hello1013320
        System.out.println(s+f);   // Hello20.5
        System.out.println(s+d);    // Hello1.222
        System.out.println(s+f+d);    // Hello20.51.222
        System.out.println(s+d+f);   // Hello1.22220.5
        System.out.println(a+d+f);   // 31.722
        System.out.println(f+d);   // 21.722
        System.out.println(a+b+c+d+f);   //184.722
//        System.out.println(a+int(b));   // Class expected

    }
}
