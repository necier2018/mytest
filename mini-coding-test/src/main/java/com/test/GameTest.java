package com.test;

import org.junit.Test;

public class GameTest {
    /**
     * Stage 1
     *
     *A number is Fizz if it is divisible by 3
     *A number is Buzz if it is divisible by 5
     *A number is FizzBuzu if it is divisible by 3 and 5
     */
    @Test
    public void test1() {
        for (int x= 1; x<=100; x++){
            if (x%3==0 && x%5 == 0){
                System.out.println("FizzBuzz");
                continue;
            }
            if (x%3 == 0){
                System.out.println("Fizz");
                continue;
            }
            if (x%5 == 0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(x);
        }
    }

    /**
     * Stage 2
     * Requirement One
     *
     *A number is Fizz if it is divisible by 3 or if it has a 3 in it
     */
    @Test
    public void test2(){
        for (int x= 1; x<=100; x++){
            int ge = x%10;
            int shi = x%100/10;

        if (x%3 == 0 || ge == 3 || shi ==3){
                System.out.println("Fizz");
                continue;
            }

            System.out.println(x);
        }
    }

    /**
     * Stage 2
     * Requirement Two
     *
     *A number is Fizz if it is divisible by 5 or if it has a 5 in it
     */
    @Test
    public void test3(){
        for (int x= 1; x<=100; x++){
            int ge = x%10;
            int shi = x%100/10;

        if (x%5 == 0 || ge == 5 || shi == 5){
                System.out.println("Fizz");
                continue;
            }
            System.out.println(x);
        }
    }

    /**
     * Stage 2
     * Requirement Three
     *
     *A number is Fizz if it is divisible by 3 or 5 or if it has a 3 or 5 in it
     */
    @Test
    public void test4(){
        for (int x= 1; x<=100; x++){
            int ge = x%10;
            int shi = x%100/10;

            if (x%3 == 0 || ge == 3 || shi == 3 || x%5 == 0 || ge == 5 || shi ==5 ){
                System.out.println("FizzBuzz");
                continue;
            }
            System.out.println(x);
        }
    }
}
