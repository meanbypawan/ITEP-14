class Task{
    public synchronized void consumingData(){
       try{ 
        System.out.println(Thread.currentThread().getName()+" got a lock and executing..");
        System.out.println("Order placed "+Thread.currentThread().getName()+" is waiting");
        wait(); // At this point lock is released
        System.out.println(Thread.currentThread().getName()+" resume and executing..");
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" is consuming data..");
            Thread.sleep(3000);
        }
       }
       catch(Exception e){
        e.printStackTrace();
       }
    }
    public synchronized void producingData(){
        try{ 
        System.out.println(Thread.currentThread().getName()+" got a lock and executing..");
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" is producing data..");
            Thread.sleep(3000);
        }
        notify();
       }
       catch(Exception e){
        e.printStackTrace();
       }
    }
}
class Producer extends Thread{
  Task task;
  public Producer(Task task){
    this.task = task;
  }
  public void run(){
    task.producingData();
  }
}
class Consumer extends Thread{
  Task task;
  public Consumer(Task task){
    this.task = task;
  }
  public void run(){
    task.consumingData();
  }
}
class TestMain{
    public static void main(String arg[]) throws Exception{
        Task task = new Task();
        Producer producer = new Producer(task);
        Consumer c1 = new Consumer(task);
        producer.setName("Producer ");
        c1.setName("Consumer-1");

        c1.start();
        c1.join(10000); // --> main stopped

        producer.start();

    }
}