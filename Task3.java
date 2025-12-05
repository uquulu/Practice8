import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть строку: ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");

        if (words.length == 0) {
            System.out.println("Немає слів.");
            return;
        }

        String min = words[0];
        String max = words[0];

        for (String w : words) {
            if (w.length() < min.length()) min = w;
            if (w.length() > max.length()) max = w;
        }

        System.out.println("Найменше слово: " + min + " (довжина: " + min.length() + ")");
        System.out.println("Найбільше слово: " + max + " (довжина: " + max.length() + ")");
    }
}