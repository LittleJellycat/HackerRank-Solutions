package DataStructures;

import java.util.Scanner;

public class TruckTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fuel = new int[n];
        int[] distance = new int[n];
        for (int i = 0; i < n; i++) {
            fuel[i] = sc.nextInt();
            distance[i] = sc.nextInt();
        }
        sc.close();

        int startPoint = 0;
        int gas = 0;
        for (int i = 0; i < n * 2; i++) {
            gas += fuel[i % n];
            if (gas - distance[i % n] < 0) {
                gas = 0;
                startPoint = i % n;
            } else {
                gas -= distance[i % n];
            }
            if (i - startPoint == n) {
                System.out.println(startPoint + 1);
                return;
            }
        }
    }
}
