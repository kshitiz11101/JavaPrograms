class Mobile{
    String brand;

    int price;
//    String name;
    static String name;  // Shared by all the objects

    // Constructor will be called always as the new object get created
    public Mobile(){
        brand="";
        price=1000;

        System.out.println("Inside Constructor");
    }

    // Static block will be called first before the constructor.
    static{
        name="Phone";    // the static block will be called only once.
        System.out.println("Inside Static Block");
    }

    public void show(){
        System.out.println("Brand: " + brand + ", Price: " + price+ ", Name: " + name);   // can use static variables in a non static method
    }
//    public static void show1(){
//        System.out.println("Static method");
////        System.out.println("Brand: " + brand + ", Price: " + price+ ", Name: " + name);   // cannot use non static variables in a static method
//    }
    public static void show1(Mobile m){
        System.out.println("Static method");
        System.out.println("Brand: " + m.brand + ", Price: " + m.price+ ", Name: " + name);   // cannot use non static variables in a static method
    }


}

public class StaticVariables {
    public static void main(String[] args) {   // if we don't create main method as static, and want to call main then we should call it using object and main is the starting of the execution of the program and we cannot make object before the execution of the program.So,there's a deadlock here.
        Mobile m1 = new Mobile();
        m1.brand = "iphone";
        m1.price = 30;
        Mobile.name = "iphone15";  // if you want to refer the static variables ,use classnames to call them.
        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 20;
        Mobile.name = "Samsung pro";
        m1.show();
        m2.show();
//        Mobile.show();  // cannot call normal methods through class names

//        Mobile.show1();  // static methods can be called through class names
        Mobile.show1(m1);  // static methods can be called through class names


    }
}
