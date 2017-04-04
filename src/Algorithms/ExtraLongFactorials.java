package Algorithms;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            result = result.multiply(BigInteger.valueOf(i + 1));
        }
        System.out.println(result);
    }
}
