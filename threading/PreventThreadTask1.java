package designpatternjava.threading;

public class PreventThreadTask1 {


    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            try {
                System.out.println(i);
                Thread.sleep(100);
            }
            catch (Exception e){
                System.out.println("Ex");
            }
        }
    }
}
