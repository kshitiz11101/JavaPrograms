public class StringbufferandStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("Computer");
//        sb1.append("Science");
//        System.out.println(sb1);
        StringBuffer sb2=new StringBuffer("Computer");
        System.out.println(sb1==sb2);  // false
        System.out.println(sb1.equals(sb2));  // false
        System.out.println(sb1.capacity());   // 24  , 16 by default
        System.out.println(sb1.length());   // 8
        System.out.println(sb1.hashCode());
        System.out.println(sb1.reverse());
        StringBuilder sb3=new StringBuilder("Computer");
        StringBuilder sb4=new StringBuilder("Computer");
        System.out.println(sb3.capacity());  // 24
        System.out.println(sb3==sb4);   // false
        System.out.println(sb3.equals(sb4));  // false


    }
}
