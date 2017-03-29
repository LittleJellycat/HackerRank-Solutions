package CodingChallenge;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        System.out.println((number % 2 != 0) || (6 <= number && number <= 20)
                ? "Weird" : "Not Weird");
    }
}
