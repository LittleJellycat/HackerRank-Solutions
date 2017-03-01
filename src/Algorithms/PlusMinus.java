package Algorithms;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroesCounter = 0;
        for (int i = 0; i < size; i++) {
            int currentNumber = sc.nextInt();
            if (currentNumber > 0) {
                positiveCounter++;
            } else if (currentNumber < 0) {
                negativeCounter++;
            } else {
                zeroesCounter++;
            }
        }
        System.out.println((double) (positiveCounter) / size + "\n"
                + (double) (negativeCounter) / size + "\n"
                + (double) (zeroesCounter) / size);
        sc.close();
    }
}
