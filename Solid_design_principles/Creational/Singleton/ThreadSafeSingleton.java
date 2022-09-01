package designpatternjava.Solid_design_principles.Creational.Singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;


public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
    if(instance == null){
        synchronized (ThreadSafeSingleton.class) {
            if(instance == null){
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
}
}