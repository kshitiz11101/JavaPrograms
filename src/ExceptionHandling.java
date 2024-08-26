public class ExceptionHandling {
    public static void main(String[] args) throws InterruptedException {
        /*
        System.out.println(10/0);  // Exception in thread "main" java.lang.ArithmeticException
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
//            e.printStackTrace();  // Exception in thread "main" java.lang.ArithmeticException: / by zero
            System.out.println(e);   // java.lang.ArithmeticException: / by zero
            System.out.println(e.getMessage());

        }
        */
       /* Java multi catch block*/
        /*
        try{
            int []a=new int[5];
            a[5]=33;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("Parent Exception");
        }
        */
        /*Finally block*/
        /*
        try{
            int data=15/0;
            System.out.println(data);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block");
        }
        */
        Thread.sleep(5000);
    }
}
