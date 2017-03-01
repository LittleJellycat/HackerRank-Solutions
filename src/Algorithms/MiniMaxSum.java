package Algorithms;

import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        long min = Long.MAX_VALUE;
        long max = 0;
        long number;
        for (int i = 0; i < 5; i++) {
            number = sc.nextLong();
            if (min > number) min = number;
            if (max < number) max = number;
            sum += number;
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
