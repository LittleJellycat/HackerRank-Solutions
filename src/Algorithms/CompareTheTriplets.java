package Algorithms;

import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alice = new int[3];
        int[] bob = new int[3];
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < 3; i++) {
            alice[i] = sc.nextInt();
        }
        for (int j = 0; j < 3; j++) {
            bob[j] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if (alice[i] > bob[i]) {
                aliceScore++;
            } else if (bob[i] > alice[i]) {
                bobScore++;
            }
        }
        sc.close();
        System.out.println(aliceScore + " " + bobScore);
    }
}
