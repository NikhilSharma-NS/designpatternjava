package thread.test;

public class FirstThread extends  Thread{

    @Override
    public void run() {
        System.out.println("Hi ");
        super.run();
    }


    public static void main(String[] args) {
        FirstThread t = new FirstThread();
        t.start();
    }
}
