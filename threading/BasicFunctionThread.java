package thread.test;

public class BasicFunctionThread {


    public static void main(String[] args) {


        String s=Thread.currentThread().getName();
        System.out.println(s);
        Thread.currentThread().setName("Nikhil Thread");
        String s1=Thread.currentThread().getName();
        System.out.println(s1);
    }
}
