package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNum = (random.nextInt(100));
        //System.out.println(randomNum);
        int i = 1;
        System.out.println("enter your first guess (1 to 100)");
        int guess1 = input.nextInt();

        while (guess1 != randomNum){
            System.out.println("that was wrong, enter your next number");
            int guess2 = input.nextInt();
            i++;
            int diff1 = (randomNum - guess1);
            int diff2 = (randomNum - guess2);
            if (guess2 == randomNum || guess1 == randomNum){
                guess1 = guess2;
            }
            else {
                if (diff1 < 0) {
                    diff1 = diff1 * -1;
                }
                if (diff2 < 0) {
                    diff2 = diff2 * -1;
                }
                if (diff2 < diff1) {
                    System.out.println("your getting warmer");
                }
                else if (diff2 == diff1){
                    System.out.println("still as warm");
                }
                else {
                    System.out.println("your getting colder");
                }

                System.out.println("that was wrong, enter your next number");
                guess1 = input.nextInt();
                i++;
                diff1 = (randomNum - guess1);
                diff2 = (randomNum - guess2);
                if (guess2 == randomNum || guess1 == randomNum){
                    guess1 = guess2;
             }
                else {
                    if (diff1 < 0) {
                        diff1 = diff1 * -1;
                    }
                    if (diff2 < 0) {
                        diff2 = diff2 * -1;
                    }
                    if (diff1 < diff2) {
                        System.out.println("your getting warmer");
                    }
                    else if (diff2 == diff1){
                        System.out.println("still as warm");
                    } else {
                        System.out.println("your getting colder");
                    }
                }
            }
        }
        System.out.println("good job you guessed the number which was "+randomNum);
        System.out.println("you guessed the number in "+i+" guesses");
        long finnish = System.currentTimeMillis();
        long timeElapsed = finnish - start;
        System.out.println("you took "+timeElapsed/1000+" seconds");




    }
}
