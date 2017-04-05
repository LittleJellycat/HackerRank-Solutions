package CrackingTheInterview.DataStructures;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int shift = sc.nextInt();
        int[] array = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
        sc.close();
        System.out.println(IntStream.range(0, n).map(i -> array[(i + shift) % n])
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
