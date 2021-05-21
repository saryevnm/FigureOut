package com.company;

import java.util.Arrays;

public class Odd_Even {
    public static void main(String[] args) {
        int[] mas = {11, 3, 14, 16, 7};
        int lengthEven = mas.length-1;
        int lengthOdd = mas.length-1;
        if (mas.length%2!=0) lengthEven--;
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted=true;
            for (int i = 0; i < lengthEven; i = i + 2) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
            for (int i = 1; i < lengthOdd; i=i+2) {
                if (mas[i]>mas[i+1]){
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
