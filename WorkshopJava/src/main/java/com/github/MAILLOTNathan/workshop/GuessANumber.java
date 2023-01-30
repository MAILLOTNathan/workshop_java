package com.github.MAILLOTNathan.workshop;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessANumber {
    public static void main(String[] args)  {
        int nb = (RandomGenerator.getDefault().nextInt(100));
        Scanner sc = new Scanner(System.in);
        System.out.print("Your guess? ");
        int entry = Integer.parseInt(sc.nextLine());
        int count = 1;

        while (entry != nb) {
            if (entry > nb)
                System.out.print("Too high!\n");
            if (entry < nb)
                System.out.print("Too low!\n");
            count++;
            System.out.print("Your guess? ");
            entry = Integer.parseInt(sc.nextLine());
        }
        if (count == 1)
            System.out.printf("It took you 1 try.\n");
        else
            System.out.printf("It took you %d tries.\n", count);
    }
}
