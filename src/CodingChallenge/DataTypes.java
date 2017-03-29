package CodingChallenge;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int inInt = scan.nextInt();
        scan.nextLine();
        double inDouble = scan.nextDouble();
        scan.nextLine();
        String inString = scan.nextLine();
        System.out.println(i + inInt);
        System.out.println(d + inDouble);
        System.out.println(s + inString);
        scan.close();
    }
}