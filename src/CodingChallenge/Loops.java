package CodingChallenge;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        for (int i = 1; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
