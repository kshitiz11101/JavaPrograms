public class ThreadNames extends Thread {
    public void run(){
        System.out.println("Run Method");
    }

    public static void main(String[] args) {
        ThreadNames threadNames = new ThreadNames();
        threadNames.start();
        System.out.println(threadNames.getName());  // Thread-0

        threadNames.setName("Aditya");
        System.out.println(threadNames.getName());  // Aditya
//        threadNames.setPriority(2);
        System.out.println(threadNames.getPriority());  // 2
        System.out.println(threadNames.getPriority());  // 5 by default
        threadNames.setPriority(Thread.MAX_PRIORITY);   // sets the thread priority to 10
        System.out.println(threadNames.getPriority());  // 10
//         1 is MIN_PRIORITY , 10 is MAX_PRIORITY and 5 is NORM_PRIORITY or default priority

    }
}
