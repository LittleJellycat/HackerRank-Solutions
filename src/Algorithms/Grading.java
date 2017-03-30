package Algorithms;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int grade = sc.nextInt();
            if (grade > 37 && (5 - (grade % 5)) < 3) {
                grade = grade + (5 - (grade % 5));
            }
            System.out.println(grade);
        }
        sc.close();
    }
}
