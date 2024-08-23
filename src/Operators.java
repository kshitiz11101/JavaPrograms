public class Operators {
    public static void main(String[] args) {
//        System.out.println(true===true);  //  illegal start of expression
        System.out.println(true==true);  // true
        System.out.println(true==false);  // false
        System.out.println(0==0);  //true
//        System.out.println(0==false);  // incomparable types: int and boolean
        System.out.println('a'==97);  //true
        System.out.println('A'==65);  //true
        Thread t1=new Thread();
        Thread t2=new Thread();
        System.out.println(t1 instanceof Thread);  //true
        System.out.println(t1 instanceof Runnable); // true
        System.out.println(t1 instanceof Object);   // true
//        System.out.println(t1 instanceof Main);   //  incompatible types: java.lang.Thread cannot be converted to Main
        System.out.println(t1==t2);   // false
        Thread t3=t1;
        System.out.println(t3==t1);  // true
        System.out.println(t3==t2);  // false
        String s1="Kshitiz";
        String s2=new String("Kshitiz");
        System.out.println(s1==s2);  // false --> Compares Reference
        System.out.println(s1.equals(s2));   // true--> Compares Content
        System.out.println('a' & 'b');  //96
        System.out.println('a' | 'b');  //99
        System.out.println(~4);  // -5
        System.out.println(~-4);  // 3





    }
}
