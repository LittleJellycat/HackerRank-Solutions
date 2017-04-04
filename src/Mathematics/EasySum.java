package Mathematics;

import java.util.Scanner;

public class EasySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(modSum(sc.nextInt(), sc.nextInt()));
        }
        sc.close();
    }

    private static int modSum(int n, int mod) {
        int result = n / mod;
        n -= result;
        if (result != 0) {
            int tail = 1;
            for (int i = 1; i < mod; i++) {
                tail += i;
            }
            result *= tail;
        }
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
