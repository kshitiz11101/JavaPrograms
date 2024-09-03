//import java.lang.classfile.Interfaces;

@FunctionalInterface
interface A1
{
//    void show();
    int add(int i,int j);
}


public class LambdaExp {
    public static void main(String[] args) {
//        A1 obj=()->System.out.println("In show");   // lambda expressions
        A1 obj=(i,j)->i+j;
//        };
        int result=obj.add(1,2);
        System.out.println(result);

//        A obj=new A(){
//            public void show(){
//                System.out.println("In show");
//            }
//            };

//        obj.show();

    }
}
