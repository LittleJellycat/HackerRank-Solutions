package Algorithms;

import java.util.HashSet;
import java.util.Scanner;

public class Pangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testString = sc.nextLine();
        sc.close();
        char[] chars = testString.toLowerCase().replaceAll("\\s", "").toCharArray();
        HashSet<Character> testSet = new HashSet<>();
        for (char aChar : chars) {
            testSet.add(aChar);
        }
        if (testSet.size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}
