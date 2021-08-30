  
class FetchDataThread extends Thread {

    @Override
    public void run() {
        System.out.println("FetchData Thread Going to sleep...");
        try {
            Thread.sleep(5000);
        } 
        catch (InterruptedException e) {
            System.out.println("FetchData Thread sleep interrupted");
        }

        System.out.println("FetchData Thread ended.");
    }
}


class ProcessDataThread implements Runnable {

    @Override
    public void run() {
        System.out.println("ProcessData Thread started");
    }
}


public class question3 {
    public static void main(String[] args) {
        FetchDataThread fetcher = new FetchDataThread();
        ProcessDataThread processor = new ProcessDataThread();
        Thread processorThread = new Thread(processor);

        fetcher.start();
        try {
            fetcher.join(10000);
        }
        catch (InterruptedException e) {
            System.out.println("Join interrupted : " + e);
        }
        processorThread.start();
    }
}