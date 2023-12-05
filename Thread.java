//Getting the current thread and displaying its info
class GetCurrentThread {  public static void main(String args[])   {    Thread t = Thread.currentThread();    t.setName("MainThread");    System.out.println("Id of current thread is: " + t.getId());    System.out.println("Name of current thread is: " + t.getName());    System.out.println("Priority of current thread is: " + t.getPriority());  
  }
}
class MultiThreads {  public static void main(String[] args)   {    System.out.println(Thread.currentThread().getName());    
    for (int i = 0; i < 10; i++)     {      new Thread("" + i)       {        public void run()         {          System.out.println("Thread: " + getName() + " running");        
        }      
      }.start();    
    }  
  }
}
public class Multiplicatin_Table implements Runnable { private int number; public Multiplicatin_Table(int number) {   this.number = number; 
  }

   @Override public void run() {  // TODO Auto-generated method stub    for (int i = 1; i <= 10; i++) {             System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(),                                                                  number, i, i * number);         } }	 public static void main(String[] args) {  // TODO Auto-generated method stub    System.out.println("I will print table of 1 to 5 ");   for (int i = 1; i <= 5; i++) {       Multiplicatin_Table mul = new Multiplicatin_Table(i);             Thread thread = new Thread(mul);             thread.start();         } }
  }
  import java.lang. * ;
  class ThreadDemo implements Runnable {  Thread t;  ThreadDemo()   {     // thread created        t = new Thread(this, "Admin Thread");        // set thread priority        t.setPriority(1);        // print thread created        System.out.println("thread = " + t);        // this will call run() function        t.start();    }
        public void run()   {     // returns this thread's priority.        System.out.println("Thread priority = " + t.getPriority());    }
          public static void main(String args[])   {    new ThreadDemo();  
        }
      }
      class SetThreadName {  public static void main(String[] args)   {     //get currently running thread object        Thread currentThread = Thread.currentThread();        System.out.println(currentThread);
               //To set name of thread, use        //void setName(String threadName) method of        //Thread class.
              currentThread.setName("Set Thread Name Example");     //To get the name of thread use,        //String getName() method of Thread class.
              System.out.println("Thread Name : " + currentThread.getName());  
        }
      }
      class SimpleRunnable implements Runnable {  public void run()   {    System.out.println("Hello from a thread!");  
        }  public static void main(String args[])   {     (new Thread(new SimpleRunnable())).start();  
        }
      }
      class CallThread {  void call(String msg)   {    System.out.print("[" + msg);    
          try     {      Thread.sleep(1000);    
          }    
          catch(InterruptedException e)     {      System.out.println("Interrupted");    
          }    System.out.println("]");  
        }
      }
      // File Name : Caller.javaclass Caller implements Runnable{    String msg;    CallThread target;    Thread t;
        public Caller(CallThread targ, String s)   {    target = targ;    msg = s;    t = new Thread(this);    t.start();  
      }   // synchronize calls to call()    public void run()    {        synchronized (target)        {            // synchronized block            target.call(msg);        }    }}
      class SyncExample {  public static void main(String args[])   {    CallThread target = new CallThread();    Caller ob1 = new Caller(target, "Thread A");    Caller ob2 = new Caller(target, "Synchronized");    Caller ob3 = new Caller(target, "Thread B");     // wait for threads to end        try        {            ob1.t.join();            ob2.t.join();            ob3.t.join();        }        catch (InterruptedException e)        {            System.out.println("Interrupted");        }    }}class ThreadDeadLock{    public static Object Lock1 = new Object();    public static Object Lock2 = new Object();
            public static void main(String args[])   {    ThreadDemo1 T1 = new ThreadDemo1();    ThreadDemo2 T2 = new ThreadDemo2();    T1.start();    T2.start();  
          }  private static class ThreadDemo1 extends Thread   {    public void run()     {      synchronized(Lock1)       {        System.out.println("Thread 1: Holding lock 1...");        
                try         {          Thread.sleep(10);        
                }        
                catch(InterruptedException e)         {        
                }        System.out.println("Thread 1: Waiting for lock 2...");        synchronized(Lock2)         {          System.out.println("Thread 1: Holding lock 1 & 2...");        
                }      
              }    
            }  
          }  private static class ThreadDemo2 extends Thread   {    public void run()     {      synchronized(Lock2)       {        System.out.println("Thread 2: Holding lock 2...");        
                try         {          Thread.sleep(10);        
                }        
                catch(InterruptedException e)         {        
                }        System.out.println("Thread 2: Waiting for lock 1...");        synchronized(Lock1)         {          System.out.println("Thread 2: Holding lock 1 & 2...");        
                }      
              }    
            }  
          }
        }
        class TwoThreadsExample {  public static void main(String[] args)   {    new SimpleThread("Thread A").start();    new SimpleThread("Thread B").start();  
          }
        }
        class SimpleThread extends Thread {  public SimpleThread(String str)   {    super(str);  
          }  public void run()   {    
            for (int i = 0; i < 5; i++)     {      System.out.println(i + " " + getName());      
              try       {        sleep((int)(Math.random() * 1000));      
              }      
              catch(InterruptedException e)       {      
              }    
            }    System.out.println("Exit! " + getName());  
          }
        }