import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] badWords = {
                "барбос",
                "дурак",
                "капец",
                "блин",
                "афигеть",
                "простофился",
                "ёшкинкот",
                "ёперный театр",
                "ёп твою мать",
                "жирный",
                "дрыщь",
                "бармалей",
                "обормот",
                "баклан",
        };

        String censor = "***";

        System.out.println("Введите текст: ");
        String text = scanner.nextLine();

        for (String word : badWords) {
            text = text.replaceAll("(?i)" + word, censor);
        }

        System.out.println("\nОтфильтрованный текст:");
        System.out.println(text);
    }
}