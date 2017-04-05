package CrackingTheInterview.DataStructures;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RansomNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int magazineWordsNumber = sc.nextInt();
        int letterWordsNumber = sc.nextInt();
        HashMap<String, Integer> dictionary = IntStream.range(0, magazineWordsNumber)
                .mapToObj(i -> sc.next())
                .collect(Collectors.toMap(Function.identity(),
                        word -> 1, (a, b) -> a + b, HashMap::new));
        for (int i = 0; i < letterWordsNumber; i++) {
            String word = sc.next();
            dictionary.merge(word, -1, (a, b) -> a + b);
            if (dictionary.get(word) < 0) {
                System.out.println("No");
                sc.close();
                return;
            }
        }
        sc.close();
        System.out.println("Yes");
    }
}
