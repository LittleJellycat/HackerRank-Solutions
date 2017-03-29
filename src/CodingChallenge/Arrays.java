package CodingChallenge;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> stack;
        int n = sc.nextInt();
        sc.nextLine();

        stack = IntStream.range(0, n).mapToObj(i -> sc.nextInt())
                .collect(Collectors.toCollection(ArrayList::new));
        for (int i = n - 1; i > 0; i--) {
            System.out.print(stack.remove(i) + " ");
        }

        System.out.print(stack.remove(0));
        sc.close();
    }
}
