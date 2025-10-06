/*
   Thread.currentThread() : Thread
 */
class First extends Thread{
   public void run(){ // t1 or t2
      for(int i=1; i<=5; i++){
       try{ 
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000);
       }
       catch(Exception e){
        e.printStackTrace();
       }
      }
   }
}
class TestMain{
    public static void main(String args[]){ // main-Thread
       Thread mainThread =  Thread.currentThread();
       mainThread.setPriority(4);
       //System.out.println(mainThread.getPriority());
       First t1 = new First();
       t1.setName("Thread-T1");
       System.out.println("Priority Of T1 : "+t1.getPriority());
       t1.start();
       
    }
}