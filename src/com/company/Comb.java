package com.company;


import java.util.Arrays;

public class Comb {

    public static void main(String[] args) {
        int[] mas = {11, 3, 14, 16, 34,54,7,45,23,23,2,1,2,0,44,34,9,5,4};
        int iteration,buf;
        int length = mas.length-1;
        iteration = length * 10 / 13;
        while (iteration!=0) {
            for (int i = 0; i < length; i++) {
                if (i+iteration>length)break;
                if (mas[i] > mas[i + iteration]) {
                    buf = mas[i];
                    mas[i] = mas[i + iteration];
                    mas[i + iteration] = buf;
                }
            }
            iteration = iteration*10/13;
        }
        System.out.println(Arrays.toString(mas));
    }
}

