package com.github.MAILLOTNathan.workshop;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            System.out.printf("%d", i);
            if (i % 3 == 0 && i % 5 != 0)
                System.out.print(" -> Fizz");
            if (i % 5 == 0 && i % 3 != 0)
                System.out.print(" -> Buzz");
            if (i % 5 == 0 && i % 3 == 0)
                System.out.print(" -> Fizzbuzz");
            System.out.print("\n");
        }
    }
}
