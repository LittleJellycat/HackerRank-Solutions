package CodingChallenge;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        return n == 1 || n == 0 ? 1 : n * factorial(n - 1);
    }
}
