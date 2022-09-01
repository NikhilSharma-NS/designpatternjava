package designpatternjava.threading;

public class SecondRunnable implements  Runnable{
    @Override
    public void run() {
System.out.println("run");
    }


    public static void main(String[] args) {
        SecondRunnable secondRunnable=new SecondRunnable();
        secondRunnable.run();


        Thread t = new Thread(secondRunnable);
        t.start();
    }
}
