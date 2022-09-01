package designpatternjava.threading;


public class FiveTask4 {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2= new Thread2();
        Thread t1_t=new Thread(t1);
        Thread t2_t=new Thread(t2);
        t1_t.start();
        t2_t.start();
    }
}
class Thread1 implements  Runnable{
    @Override
    public void run() {
System.out.println("Thread1");
    }




}

class  Thread2 implements  Runnable{
    @Override
    public void run() {
        System.out.println("Thread2");
    }
}
