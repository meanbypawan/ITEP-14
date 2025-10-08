/*
  interface Runnable{
     public void run();
  }

  This interface only have one abstract method so it called Functional Interface.
  If it is functiional interface then we can apply Lambda Expression
 */
class TestMain{
    public static void main(String args[]){
       Runnable r1 = ()->{
        try{
           for(int i=1; i<=5; i++){
             System.out.println("Cheeku...");
             Thread.sleep(2000);
           }
        }
        catch(Exception e){
          e.printStackTrace();
        }
       };
       Runnable r2 = ()->{
        try{
           for(int i=1; i<=5; i++){
             System.out.println("Peeku...");
             Thread.sleep(1300);
           }
        }
        catch(Exception e){
          e.printStackTrace();
        }
       };

       new Thread(r1).start();
       new Thread(r2).start();
    }
}