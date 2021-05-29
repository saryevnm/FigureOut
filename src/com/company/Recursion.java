package com.company;


public class Recursion {

    public static void main(String[] args){
        int power=2,number=5;
        System.out.println(getFactorial(number));

        System.out.println(getPower(number,power));
    }

    private static int getFactorial(int number) {
       if (number==0){
           return 1;
       }else{
           return (number*getFactorial(number-1));
       }
    }
    private static int getPower(int number,int power){
        {
            if( power==0)
                return 1;
            else
                return (number*getPower(number,power-1));
        }
    }
}