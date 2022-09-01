package designpatternjava.Solid_design_principles.Creational.Builder;

public class Demo {

    public static void main(String[] args) {
        String[] word={"hello","world"};
        StringBuilder stringBuilder=new StringBuilder();
        for (String w: word)
        {
            stringBuilder.append(w);
        }

        System.out.println(stringBuilder);
    }
}
