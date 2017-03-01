package Java;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int substringLength = sc.nextInt();
        sc.close();
        String min = s.substring(0, substringLength);
        String max = s.substring(0, substringLength);
        for (int i = 1; i < s.length() - substringLength; i++) {
            if (min.compareTo(s.substring(i, substringLength + 1)) > 0) min = s.substring(i, substringLength + 1);
            if (max.compareTo(s.substring(i, substringLength + 1)) < 0) max = s.substring(i, substringLength + 1);
        }
        System.out.println(min);
        System.out.println(max);
    }
}
