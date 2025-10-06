/*
  1. By extending Thread Class
  2. By Implementing Runnable Interface
 */
class First extends Thread{
   public void run(){
      for(int i=1; i<=100000; i++){
       try{ 
        Thread.sleep(2000);
        System.out.println("Cheeku...");
       }
       catch(InterruptedException e){
        e.printStackTrace();
       }
      }
   }
}
class Second extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
           try{ 
            Thread.sleep(1200);
            System.out.println("Peeku");
           }
           catch(InterruptedException e){
            e.printStackTrace();
           }
        }
    }
}
class TestMain{
    public static void main(String ag[]){
        First t1 = new First(); // t1 is a thread object
        Second t2 = new Second();
        t1.start(); // t1.run()
        t2.start();
    }
}