package CrackingTheInterview.DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class MakingAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] firstWord = sc.next().toCharArray();
        char[] secondWord = sc.next().toCharArray();
        sc.close();
        int[] frequency = new int[26];
        for (int ch : firstWord) frequency[ch - 'a']++;
        for (int ch : secondWord) frequency[ch - 'a']--;
        System.out.println(Arrays.stream(frequency).map(Math::abs).sum());
    }
}
