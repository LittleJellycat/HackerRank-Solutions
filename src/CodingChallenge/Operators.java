package CodingChallenge;

import java.util.*;

public class Operators {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        scan.close();

        double sum = mealCost + mealCost * (tipPercent + taxPercent) / 100;
        int totalCost = (int) Math.round(sum);
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}