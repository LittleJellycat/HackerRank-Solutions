package CodingChallenge;

import java.util.Scanner;

public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        int max = 0;
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') {
                count++;
            } else {
                if (max < count) max = count;
                count = 0;
            }
        }
        System.out.println(Math.max(count, max));
    }
}
