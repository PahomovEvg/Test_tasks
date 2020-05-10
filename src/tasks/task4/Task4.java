package tasks.task4;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String s = input("Введите предложение: ");
        String w = input("Введите искомое слово: ");
        int count = count(s, w);
        System.out.print("В предложении " + count + " искомых слов");
    }

    private static String input(String sent_word) {
        Scanner str = new Scanner(System.in);
        System.out.print(sent_word);
        return str.nextLine();
    }

    private static int count(String sentence, String word) {
        String[] strings = sentence.split(" ");
        int i = 0;
        for (String string : strings) {
            if (word.equalsIgnoreCase(string)) {
                i++;
            }
        }
        return i;
    }
}