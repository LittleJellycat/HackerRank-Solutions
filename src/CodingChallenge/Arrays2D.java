package CodingChallenge;

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                int currentHourglassSum = arr[i][j] + arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1] +
                        arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1];
                if (currentHourglassSum > maxSum) maxSum = currentHourglassSum;

            }
        }
        System.out.println(maxSum);
    }
}
