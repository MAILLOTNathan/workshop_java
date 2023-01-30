package com.github.MAILLOTNathan.workshop;

import javax.sound.midi.SysexMessage;
import javax.swing.*;

public class Fibonacci {
    private static int recursive(int nb) {
        if (nb == 0)
            return 0;
        if (nb == 1)
            return 1;
        return recursive(nb - 1) + recursive(nb - 2);
    }

    private static int iterative(int nb) {
        int i = 2;
        int a = 1;
        int b = 1;
        int c = 0;

        while (i < nb) {
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        return c;
    }

    public static void main(String[] args) {
        int nb = 10;

        if (args.length != 0)
            nb = Integer.parseInt(args[0]);
        System.out.printf("Suite de Fibonacci de %d:\n", nb);
        System.out.printf("Recursive: %d\n", Fibonacci.recursive(nb));
        System.out.printf("Iterative: %d\n", Fibonacci.iterative(nb));
    }
}
