public class StringOperations {
    public static void main(String[] args) {
            String s="Kshitiz";

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.toCharArray());   // Kshitiz
        System.out.println(s.toCharArray()[0]);  //K
        System.out.println(s.toCharArray()[4]);  //t
        System.out.println(s.charAt(3));   // i
        System.out.println(s.endsWith("z"));  // true
        System.out.println(s.startsWith("k"));  //false
        System.out.println(s.startsWith("K"));  //false
        System.out.println(s.concat(" Sharma"));
        System.out.println(s.intern());  //Kshitiz
        System.out.println(s.replace("Sharma", "Kumar"));
        System.out.println(s.subSequence(0,3));
        System.out.println(s.substring(1));
        System.out.println(s.substring(1,5));
        System.out.println(s.getClass()); // class java.lang.String
        System.out.println(s.getClass().getName()); // java.lang.String
        System.out.println(s.trim());


    }
}
