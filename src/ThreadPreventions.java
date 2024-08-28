public class ThreadPreventions extends Thread {
    public void run() {
        Thread.yield();
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread");
            try {
                Thread.sleep(2000);   // print each child thread within 2s and then prints main thread
            } catch (InterruptedException e) {

            }
        }
    }
}
class myThread{
    public static void main(String[] args) throws InterruptedException {
        ThreadPreventions threadPreventions = new ThreadPreventions();
//        threadPreventions.start();   // if we comment this line,both threads will run simultaneously and we can't predict the output. Only main thread will be printed 10 times
        threadPreventions.join();
        for (int i=0;i<10;i++){
            System.out.println("Main thread");
        }
    }
}

