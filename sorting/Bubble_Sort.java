package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {


    public static void main(String[] args) {
       int [] a ={1,2,3,4,10,16,24,14};
int teamp;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j]>a[j+1])
                {
                   teamp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=teamp;
                }
            }
        }

        for (int val : a) {
            System.out.println(val);

        }


    }
}
