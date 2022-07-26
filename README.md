Design Pattern in Java

1) Creational 
2) Structural
3) Behavioral


1) Creational
   1.1) Builder
   1.2) Factories
     1.2.1) Abstract Factory
     1.2.2) Factory Method
   1.3) Prototype
   1.4) Singleton

2) Structural 
   2.1) Adapter 
   2.2) Bridge
   2.3) Composite
   2.4) Decorator
   2.5) Facade
   2.6) Flyweight
   2.7) Proxy

3) Behavioural 
   3.1) Chain of Responsibility 
   3.2) Command 
   3.3) Interpreter
   3.4) Iterator
   3.5) Mediator
   3.6) Memento
   3.7) Null Object
   3.8) Observer
   3.9) State
   3.10) Strategy
   3.11) Template Method
   3.12) Visitor


Single Resposiblity Principle

Open Closed Principle

Liskov Substitution Principle

Interface Segregation Principle 

Dependency Inversion Principle

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

