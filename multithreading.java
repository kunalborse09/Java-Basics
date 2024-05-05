//----------------------->  Multithreading  <-----------------------//



// By Extending Thread Class :---->


/*class A extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1 ; i<=5 ; i++)
            {
                System.out.println("Kunal");
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {

        }
    }
}
class multithreading {
    public static void main(String[] args) throws Exception{
        A t = new A();
        t.start();

        for(int i=1 ; i<=5 ; i++)
        {
            System.out.println("Borse");
            Thread.sleep(1000);
        }
    }    
}
*/





// By Implementing Runnable Interface :----->
/* 
class A implements Runnable
{
    public void run()
    {
        for(int i=1 ; i<=5 ; i++)
        {
            System.out.println("My child thread");
        }
    }    
}
class multithreading
{
    public static void main(String[] args) {
        A r = new A();

        Thread t = new Thread(r);
        t.start();

        for(int i=1 ; i<=5 ; i++)
        {
            System.out.println("Main thread");
        }
    }
}

*/






// ---------------> Thread Schedular <---------------- //

/*class A extends Thread
{
    public void run()
    {
        String n = Thread.currentThread().getName();
        for(int i=1 ; i<=3 ; i++)
        {
            System.out.println(n);
        }
    }
}
class multithreading
{
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        String n = Thread.currentThread().getName();
        for(int i=1 ; i<=3 ; i++)
        {
            System.out.println("main thread");
        }
    }
}*/