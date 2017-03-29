package CodingChallenge;

import java.util.HashMap;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int phone = sc.nextInt();
            phoneBook.put(name, phone);
        }
        while (sc.hasNext()) {
            String s = sc.next();
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}
