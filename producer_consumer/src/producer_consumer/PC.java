package producer_consumer;

import java.util.LinkedList;


public class PC 
{
    LinkedList<Integer> l=new LinkedList<>();
    int capacity=3;
    
    public void produce() throws InterruptedException 
    { 
        int value = 1; 
        while(true)
        { 
            synchronized(this) 
            { 
                // producer thread waits while list is full 
                while (l.size() == capacity) 
                    wait(); 
  
                System.out.println("Producer produced:"+ value); 
  
                // to insert the jobs in the list 
                l.addFirst(value++);
  
                // notifies the consumer thread that now it can start consuming 
                notify(); 
  
                // makes the working of program easier to  understand  
                Thread.sleep(1000); 
            } 
        } 
    } 
    
    public void consumer() throws InterruptedException 
    { 
        int value; 
        while (true)
        { 
            synchronized (this) 
            { 
                // consumer thread waits while list is empty 
                while (l.size() == 0) 
                    wait(); 
   
                // to remove jobs from the list
                value=l.removeLast();
                System.out.println("Conusmer consumed:"+ value); 
  
                // waking up producer thread 
                notify(); 
  
                // makes the working of program easier to understand  
                Thread.sleep(1000); 
            } 
        } 
    } 
}
