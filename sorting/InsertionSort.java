package designpatternjava.sorting;


public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 10, 16, 24, 14};
int temp,j;

        for (int i = 1; i < a.length; i++) {
            temp = a[i];

            j=i;

            while (j>0 && a[j-1] > temp){
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }

        for (int val : a) {
            System.out.println(val);

        }


    }

}
