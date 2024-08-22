public class VariableTypes {
    static int a=50;
    int i=5;

    public static void main(String[] args) {
//        Based upon values,variables are of two types: Primitive and Reference.
//        Based on position and declaration,they are of three types: Instance,Static and Local Variables.
//        System.out.println(i);  //non-static variable i cannot be referenced from a static context
        VariableTypes v=new VariableTypes();
        System.out.println(v.i);
        System.out.println(a);    // can be accessed with or without object
        System.out.println(v.a);
//        local variables
        int b=10;
        for (int i = 0; i < 3; i++) {
        b=b+i;
        }
        System.out.println(b);
    }
}
