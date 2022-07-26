package thread.test;

public class BasicFunctionThread1 {

    public static void main(String[] args) {
        Thread4 t4=new Thread4();
        Thread t1=new Thread(t4);
        Thread t2=new Thread(t4);
        t1.start();
        t2.start();
        System.out.println("Main Method"+Thread.currentThread().getName());

    }
}



class Thread4 implements Runnable{


    @Override
    public void run() {
        System.out.println("RUN");
        System.out.println("Run Method"+Thread.currentThread().getName());
    }
}
