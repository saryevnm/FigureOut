package com.company.armstrong;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(checker(number));
    }

    private static boolean checker(int number) {
        String num = String.valueOf(number);
        int result=0;
        for (int i = 0; i < num.length(); i++) {
            int row = Integer.parseInt(String.valueOf(num.charAt(i)));
            result = result+(row*row*row);
        }
        return result == number;
    }
}
