class Calculate{
    public int sum(int a, int b){
        int r= a+b;
        return r;
    }
    public int sum(int a, int b, int c){
        int r= a+b+c;
        return r;
    }
    public double sum(double a,double b){
        double r=a+b;
        return r;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        int ans1=calc.sum(10,20);
        int ans2=calc.sum(10,20,30);
        double ans3=calc.sum(12.333,12.44);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}
