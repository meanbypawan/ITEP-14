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
       Second t2 = new Second();
       Third t3 = new Third();
        
       t1.start();
       
       t1.join(5000); // It will stopped main for 5000 ms
 
       t2.start();
       t3.start();
    }
}