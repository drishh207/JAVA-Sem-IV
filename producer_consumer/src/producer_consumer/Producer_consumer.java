package producer_consumer;

public class Producer_consumer 
{
    public static void main(String[] args) throws InterruptedException 
    {
       final PC obj=new PC();
       
       Thread t1 = new Thread(new Runnable() 
       { 
            @Override
            public void run() 
            { 
                try 
                { 
                    obj.produce();
                } 
                catch (InterruptedException ex) 
                {
                    System.out.println(ex.getMessage());
                }
                
            } 
        }); 
       
       Thread t2 = new Thread(new Runnable() 
       { 
            @Override
            public void run() 
            { 
                try 
                { 
                    obj.consumer();
                } 
                catch (InterruptedException ex) 
                {
                    System.out.println(ex.getMessage());
                }
                
            } 
        });
       
       t1.start();
       t2.start();
       
       t1.join();
       t2.join();
    }
    
}
