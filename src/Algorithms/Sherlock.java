package Algorithms;

import java.util.Scanner;

public class Sherlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int shift = sc.nextInt();
        int numberOfQuestions = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < numberOfQuestions; i++) {
            System.out.println(array[(sc.nextInt() - (shift % array.length) + array.length) % array.length]);
        }
        sc.close();
    }
}
