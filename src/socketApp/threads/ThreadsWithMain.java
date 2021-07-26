package socketApp.threads;

 class MyTask implements Runnable{
     @Override
     public void run() {
         for(int doc=1; doc<=10; doc++){
             System.out.println("$$Printing document " + doc + " with - Printer 1");
         }
     }
 }
 class YourTask implements Runnable{
     @Override
     public void run() {
         for(int doc=1; doc<=10; doc++){
             System.out.println("##Printing document " + doc + " with - Printer 3");
         }
     }
 }class OurTask implements Runnable{
     @Override
     public void run() {
         for(int doc=1; doc<=10; doc++){
             System.out.println("&&Printing document " + doc + " with - Printer 4");
         }
     }
 }

//class MyTask extends Thread{
//    @Override
//    public void run(){
//        for(int doc=1; doc<=10; doc++){
//            System.out.println("##Printing document " + doc + " with - Printer 1");
//        }
//    }
//
//}


public class ThreadsWithMain {
    public static void main(String[] args) {

        System.out.println("Job2 Started.....");

//        MyTask newTask = new MyTask();
//        newTask.start();
        Runnable runnable = new MyTask();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        new Thread(new YourTask()).start();
        new Thread(new OurTask()).start();

        for(int doc=1; doc<=10; doc++){
            System.out.println("@@ Printing document "+ doc + " with - Printer 2");
        }
        System.out.println("Job2 ended........");
    }

}
