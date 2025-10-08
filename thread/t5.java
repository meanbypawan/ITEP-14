class First implements Runnable{
    public void run(){
       try{
         for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(5000);
         }
       }
       catch(Exception e){
         e.printStackTrace();
       }
    }
}
class TestMain{
    public static void main(String args[]){
        Runnable r1 = new First();
        Thread t1 = new Thread(r1);
        t1.start(); // run() fo r1
    }
}