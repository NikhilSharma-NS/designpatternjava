package designpatternjava.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 10, 16, 24, 14};
int temp;
        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j < a.length; j++) {

                if (a[i] > a[j])
               {
                   temp=a[j];
                   a[j]=a[i];
                   a[i]=temp;
                }

            }

        }
        for (int val : a) {
            System.out.println(val);

        }

    }
}
