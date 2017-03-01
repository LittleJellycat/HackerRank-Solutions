package Algorithms;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime time = LocalTime.parse(sc.next(), DateTimeFormatter.ofPattern("hh:mm:ssa"));
        sc.close();
        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
