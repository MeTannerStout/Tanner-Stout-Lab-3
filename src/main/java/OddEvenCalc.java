/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author metan
 */
public class OddEvenCalc {
    public static boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Random r = new Random();

        int even = 0, odd = 0;

        for (int i = 0; i < 100; ++i) {

            int number = r.nextInt();

            if (isEven(number)) {
                ++even;
            } else {
                ++odd;
            }
        }

        System.out.println("Number of Even numbers: " + even);

        System.out.println("Number of Odd numbers: " + odd);

        
    }
}
