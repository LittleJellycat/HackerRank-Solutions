package Algorithms;

import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
