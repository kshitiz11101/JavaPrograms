class Computer{
    public void playMusic(){
        System.out.println("Playing music....");
    }
    public String getMePen(int cost){
       return cost>=10?"Pen":"Pay more than 10";
    }


}

class Calculator{
   public int sum(int a, int b){
        int r= a+b;
        return r;
    }
}

public class ClassandObjects {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
       int res= cal.sum(1, 2);
        System.out.println(res);
        Computer comp = new Computer();
        comp.playMusic();
       String ans= comp.getMePen(1);
        System.out.println(ans);
    }
}
