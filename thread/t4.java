/*
   Thread.currentThread() : Thread
 */
class First extends Thread{
   public void run(){ // t1 or t2
      for(int i=1; i<=5; i++){
       try{ 
        System.out.println("Thread - T1");
        Thread.sleep(2000);
       }
       catch(Exception e){
        e.printStackTrace();
       }
      }
   }
}
class Second extends Thread{
   public void run(){ // t1 or t2
      for(int i=1; i<=5; i++){
       try{ 
        System.out.println("Thread - T2");
        Thread.sleep(1200);
       }
       catch(Exception e){
        e.printStackTrace();
       }
      }
   }
}
class Third extends Thread{
   public void run(){ // t1 or t2
      for(int i=1; i<=5; i++){
       try{ 
        System.out.println("Thread - T3");
        Thread.sleep(1500);
       }
       catch(Exception e){
        e.printStackTrace();
       }
      }
   }
}
class TestMain{
    public static void main(String args[]) throws Exception{ // main-Thread
       First t1 = new First();
       System.out.println("After Creating : "+t1.getState()); 
       t1.start(); // --- Runnable
       System.out.println("After Start : "+t1.getState());
       t1.join(); // ----> Main Stopped
       System.out.println("After Join : "+t1.getState());
       for(int i=1; i<=5; i++){
          System.out.println(Thread.currentThread().getName());
          Thread.sleep(3000);
       }
    }
}