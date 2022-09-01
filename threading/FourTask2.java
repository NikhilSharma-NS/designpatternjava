package designpatternjava.threading;

public class FourTask2 implements  Runnable{

    @Override
    public void run() {
        System.out.println("Run");
    }

    public static void main(String[] args) {
        FourTask2 t2=new FourTask2();
        Thread t= new Thread(t2);
        Thread t1= new Thread(t2);
        t.start();
        t1.start();

    }
}
