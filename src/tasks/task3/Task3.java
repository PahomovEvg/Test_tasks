package tasks.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String s = input();
        String[] strings = s.split(" ");
        Arrays.sort(strings);
        int count = count(strings);
        System.out.println("Кол-во слов: " + count);
        String regist = reg(strings);
        System.out.println("Все слова с заглавной: " + regist);
    }

    private static String input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        return s.nextLine();
    }

    private static int count(String[] strings) {
        return strings.length;
    }

    private static String reg(String[] strings) {
        String str = "";
        for (String string : strings) {
            str = str + string.substring(0, 1).toUpperCase() + string.substring(1) + " ";
        }
        return str;
    }
}