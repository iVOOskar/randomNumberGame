package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNum = (random.nextInt(100));
        System.out.println(randomNum);

        System.out.println("enter your first guess (1-100)");
        int guess1 = input.nextInt();

        while (guess1 != randomNum){
            System.out.println("that was wrong, enter your next number");
            int guess2 = input.nextInt();
            int diff1 = (randomNum - guess1);
            int diff2 = (randomNum - guess2);
            if (diff1<0){
                diff1 = diff1*-1;
            }
            if (diff2<0){
                diff2 = diff2*-1;
            }
            if ()

        }
        System.out.println("good job you guessed the number");




    }
}
