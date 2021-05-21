package com.company;

import java.util.Arrays;

public class Coctail {

    public static void main(String[] args) {
        int[] mas = {11, 3, 14, 16, 7,6,7,34,76,56,45,343,3};
        sort(mas);
    }

    public static void sort(int[] mas) {

        boolean isSorted = false;
        int buf;
        int length = mas.length - 1;
        int start = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = start; i < length; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
            if (isSorted){
                break;
            }
            length--;
            for (int i = length; i > 0; i--) {
                if (mas[i] < mas[i - 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = buf;
                }
            }
            start++;
        }
        System.out.println(Arrays.toString(mas));
    }
}
