
public class ThreadOperations extends Thread {
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Run Method");
        }

    }
    public void run(int i){
        System.out.println("Argument Run Method");
    }
    public void start(){
        super.start();
        System.out.println("Overridden Start Method");
    }

    public static void main(String[] args) {
        ThreadOperations threadOperations = new ThreadOperations();
//        threadOperations.start();  // 10 times main method followed by 10 times run method
//        threadOperations.run();   // 10 times run method followed by 10 times main method

//        threadOperations.run();   // if we don't override the run method, and call the run method of Thread Class which has empty implementation , only 5 times main thread will be printed
//       threadOperations.run(10);
       threadOperations.start();
        for (int i=0;i<10;i++){
            System.out.println("Main Method");
        }


    }
}
