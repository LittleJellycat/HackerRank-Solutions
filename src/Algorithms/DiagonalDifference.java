package Algorithms;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += (matrix[i][i] - matrix[i][size - i - 1]);
        }
        System.out.println(Math.abs(sum));
        sc.close();
    }
}
