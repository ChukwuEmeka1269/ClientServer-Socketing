package socketApp.threads;


class Printer{
    synchronized void printDocument(int numberOfCopies, String docName){
        for(int doc=1; doc<=numberOfCopies; doc++){
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(">>> Printing " +docName + doc ) ;
        }
    }
}

class MyThread implements Runnable{

    Printer pRef;
    MyThread(Printer print){
        pRef = print;
    }

    @Override
    public void run() {
        pRef.printDocument(8, "Manuel's.pdf");
    }
}

class YourThread implements Runnable{
    Printer pRef;
    YourThread(Printer print){
        pRef = print;
    }

    @Override
    public void run() {
        pRef.printDocument(8,"Rexco.pdf");
    }
}


public class MultiThreadClass {
    public static void main(String[] args) {
        System.out.println("==Application Started==");

        Printer printDoc = new Printer();
//        printDoc.printDocument(5, "EmekaCv.pdf");


       Runnable runnable = new MyThread(printDoc);
       Thread runThread = new Thread(runnable);
        Runnable run2 = new YourThread(printDoc);
        Thread thread2 = new Thread(run2);

       runThread.start();

        thread2.start();




        System.out.println("==Application Finished==");
    }
}
