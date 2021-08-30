import java.util.LinkedList;
import java.lang.Math;
 
public class question4 {
    public static void main(String[] args)
        throws InterruptedException
    {
        // Object of a class that has both write()
        // and read() methods
        final Message message = new Message();
 
        // Create writer thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    message.write();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
 
        // Create reader thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    message.read();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
 
        // Start both threads
        t1.start();
        t2.start();
 
        // t1 finishes before t2
        t1.join();
        t2.join();
    }
 
    
    public static class Message {
 
        // Create a list writer and reader 
        LinkedList<String> list = new LinkedList<>();
        int capacity = 3;
 
        
        public void write() throws InterruptedException
        {
            String text = "";
            text =  String.valueOf(Math.random());
            boolean isEmpty = true;

            while (true) {
                synchronized (this)
                {
                    // writer thread waits while list
                    // is full
                    while (list.size() == capacity)
                        wait();
 
                    System.out.println("Writer thread: "
                                       + text);
 
                    // to insert the jobs in the list
                    text = String.valueOf(Math.random());
                    list.add(text);
                    isEmpty = false;
 
                    // notifies the reader thread that
                    // now it can start reading
                    notify();

                    // and sleep
                    Thread.sleep(1000);
 
                   
                }
            }
        }
 
        
        public void read() throws InterruptedException
        {
            while (true) {
                synchronized (this)
                {
                    // reader thread waits while list
                    // is empty
                    while (list.size() == 0)
                        wait();
 
                    // to retrieve the first job in the list
                    String val = list.removeFirst();
 
                    System.out.println("Reader thread-"
                                       + val);
 
                    // Wake up writer thread
                    notify();
 
                    // and sleep
                    Thread.sleep(1000);
                }
            }
        }
    }
}