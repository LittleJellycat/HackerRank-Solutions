package CodingChallenge;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Review {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        sc.close();

        ArrayList<String> list = IntStream.range(0, n).mapToObj(i -> sc.nextLine())
                .collect(Collectors.toCollection(ArrayList::new));
        for (String str : list) {
            for (int i = 0; i < str.length(); i += 2) {
                System.out.print(str.charAt(i));
            }
            System.out.print(" ");
            for (int i = 1; i < str.length(); i += 2) {
                System.out.print(str.charAt(i));
            }
            System.out.print("\n");
        }
    }
}