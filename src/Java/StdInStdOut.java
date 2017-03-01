package Java;

import java.util.Scanner;

public class StdInStdOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());
        System.out.println(sc.nextInt());
        System.out.println(sc.nextInt());
        sc.close();
    }
}
