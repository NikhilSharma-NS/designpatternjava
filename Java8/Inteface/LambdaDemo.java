package designpatternjava.Java8.Inteface;

interface  A{
    public void show();
}


public class LambdaDemo {

    public static void main(String[] args) {


        A obj= new A(){
            @Override
            public void show() {
                System.out.println("Hi");
            }
        };

        obj.show();


        A ob1 = () -> {
            System.out.println("Hello Lam");
        };
        ob1.show();
    }
}
