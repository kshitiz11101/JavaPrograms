class A{
    public void show1(){
        System.out.println("A show method");
    }
        }

        class B extends A{
    public void show2(){
        System.out.println("B show method");
    }
}


public class UpcastingandDowncasting {
    public static void main(String[] args) {
//        A obj=new A();


//        Upcasting
        A obj= new B();    // Object is of B ,but it is referring to A.
        obj.show1();

//        Downcasting
        B obj1=(B)obj;   // obj is parent object and we're downcasting to its children object B.
        obj1.show2();   // bcz A doesn't have any idea what B is

    }
}
