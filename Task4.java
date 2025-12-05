import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть строку: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }

        System.out.println("Результат: " + result);
    }
}