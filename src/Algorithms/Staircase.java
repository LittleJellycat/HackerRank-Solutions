package Algorithms;

import java.util.Scanner;
import java.util.stream.Stream;

public class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        sc.close();
        for (int i = 0; i < height; i++) {
            Stream.generate(() -> " ").limit(height - 1 - i).forEach(System.out::print);
            Stream.generate(() -> "#").limit(i + 1).forEach(System.out::print);
            System.out.println();
        }
    }
}
