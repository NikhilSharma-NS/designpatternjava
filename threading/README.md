Process 

1) a program which is in execting state
2) It is heavy weight
3) Context Switching - take more time
4) Communication - takes more time
5) Adrees space - each process has different address space
6) Dependency - process are not dependent on each other
7) Synchrozation - it doeen't require sync
8) Resource consumtion - more
9) time of creation - more
10) time of termination - more

Thread

1) It is sub part of process
2) This is light weight
3) Context Switching - takes less time
4) Communication - takes less time
5) Adreess Space - Thread share same address space
6) Dependecny - Thraedy are depedent on each other
7) Synchrozation - it may require sync
8) Resource consumtion - less
9) time of creation - less
10) time of termination - less


ways to create Threads

1) By Thread Class
2) By Runnable Interface


1) By Thread Class
   1.1) extends the Thread class
   1.2) override the run method
   1.3) Create the Object of class
   1.4) start the thread 

```
                               
                    Non Runnable State(sleep,waiting,suspend) 

 Create ->       Runnable                -> Running    -> Dead
  3               4                           2
                   JVM will allocate the processor    onec task done 
```

2) By Runnable Interface
   2.1) implements the Runnable interface
   2.2) override the run method
   2.3) Create the Thread class and another class as well and pass the parameter of another class in Thraed constuctor 
   2.4) start the thread


1) Performing single task from single Thread
2) Performing single task from multiple Thread
3) Performing multiple task from single Thraed
4) Performing multiple task from  multiple Thread
   

##### Constructor

Thread()
Thread(Runnable taarget)
Thread(String name)
Thread(Runnable target,String name)

Thread(ThreadGroup tg,Runnable target)
Thread(ThreadGroup tg,String name)
Thread(ThreadGroup tg,Runnable target,String name)
Thread(ThreadGroup tg,Runnable target,String name,long stackSize)


##### Method
Basic Method

run 
start
currentThraed -> this is static method -> it will provide thread refernce
isAlive() -> boolean return

Naming Method

getName
setName

Daemon method 

isDaemon
setDaemon(boolean b)

priority based method

getPriority()
setPriority(int pv)

Preventing thread exection method

sleep(time)
yield()
join()
suspend() resume stop destrory

Intrripting the thread method

intrrupt
isIntrrupted()
interrupted()


##### Interthread Communication

wait()
notify()
notifyAll()

this are part of Object class


##### Daemon Thread

Def - Which run in the background of another thread
Use - It provides service to the thread
EG : Garbage Collector , finalizer , attach listenses , singal dispaches etc

Method

public final void setDaemon(boolean b)
public final boolean isDaemon()

CAse 1- we have to create daemon thread before starting th ethread

if we will create after stating then we will get IlligalThreadStateExcetion

Case 2- we cannot create main thread daemon thread

Daemon Thread Life depends on Another Thread

Nature of Daemon Thread - It Inherit the properties from it's parent thread


- JVM provides the prorites to each thread and according to these priorites JVM allocates the processor
- Prorities are represented in the form of integer 1 to 10
- 1 - MIN_PRIORITY 5- NORM_PRIORITY 10 - MAX_PRIORITY


Methods 

- public final void setPriority(int value)

- public final int getPriority(int value)]
  
Default - Prority are inherted from parent thread - which is 5 default

If priority value is not 1 to 10 then will get RunTime exception IlligalArgumentException

Priority depends on the platform ( windoes does not support)

##### Prevent thread Execution methood



public static native void sleep(long mili) throws InterruptedException

public static void sleep(long mili, int nano) throws InterruptedException
