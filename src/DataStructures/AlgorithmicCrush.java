package DataStructures;

import java.util.Scanner;

public class AlgorithmicCrush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[sc.nextInt() + 1];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            int value = sc.nextInt();
            arr[left - 1] += value;
            arr[right] -= value;
        }
        long max = 0;
        long current = 0;
        for (long diff : arr) {
            current += diff;
            if (max < current) max = current;
        }
        System.out.println(max);
    }
}
