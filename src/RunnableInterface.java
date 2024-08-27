class RunnableInterface implements Runnable {
    public void run() {
        System.out.println("Run Method");
//        for (int i=0;i<10;i++){
//            System.out.println(Runtime.getRuntime().availableProcessors());
//        }
    }
    public static void main(String[] args) {
        RunnableInterface r = new RunnableInterface();
        Thread t1=new Thread(r);
        Thread t2=new Thread();
        t1.start();  // a new thread will be created
        t2.start(); // a new thread will be created
        t1.run();   // Output: Run Method. No new thread will be created and RunnableInterace run() method will be called just like normal method.
        t2.run();  // No new thread will be created and Thread Class run() method will be called which has empty implementation.

//        r.start();  // java: cannot find symbol symbol:   method start location: variable r of type RunnableInterface
        r.run();   // Run Method. No new Thread will be created and RunnableInterface run() method will be called as normal method.

//        for (int i = 0; i < 10; i++) {
//           System.out.println(Thread.currentThread().getName());
//        }
    }
}
