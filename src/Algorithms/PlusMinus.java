package Algorithms;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Map<Float, Long> collect = IntStream.range(0, size)
                .map(i -> sc.nextInt()).boxed()
                .collect(Collectors.groupingBy(Math::signum, Collectors.counting()));
        System.out.println((double) (collect.get(1.0f)) / size);
        System.out.println((double) (collect.get(0.f)) / size);
        System.out.println((double) (collect.get(-1.0f)) / size);
        sc.close();
    }
}
