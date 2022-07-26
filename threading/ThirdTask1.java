package thread.test;

public class ThirdTask1 implements  Runnable{

    @Override
    public void run() {
        System.out.println("Thraed Task");
    }

    public static void main(String[] args) {

        ThirdTask1 t1=new ThirdTask1();
        Thread t=new Thread(t1);
        t.start();
    }
}
