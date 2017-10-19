package Algorithms;

import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candles = new int[n];
        for (int i = 0; i < n; i++) {
            candles[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(countCandles(candles));
    }

    private static int countCandles(int[] candles) {
        int maxHeight = 0;
        int count = 0;
        for (int candle : candles) {
            if (candle > maxHeight) {
                maxHeight = candle;
                count = 1;
            } else if (candle == maxHeight) {
                count++;
            }
        }
        return count;
    }
}
