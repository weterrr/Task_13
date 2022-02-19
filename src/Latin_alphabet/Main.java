package Latin_alphabet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите строку из слов, разделенных пробелами: ");
        a = in.nextLine();
        int j = 0;
        String[] words = a.split(" ");
        for (int i  = 0; i < words.length; i++) {
            boolean S = words[i].matches("^[A-Za-z.]+$");
            if (S == true) {
                j++;
                System.out.println(words[i]);
            }
        }
        System.out.println("Колличество слов, состоящих только из латиницы: " + j);
    }
}
