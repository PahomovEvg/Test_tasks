package tasks.task5;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int n = input();
        palindrom(n);
    }

    private static int input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите длинну последовательности меньше 100: ");
        int n = s.nextInt();
        if (n <= 100) {
            return n;
        } else {
            System.out.println("Вы ввели число больше 100");
            return input();
        }
    }

    private static void palindrom(int a) {
        System.out.println("Числа-палиндромы: ");
        for (int i = 1; i != a; i++) {
            int x = i / 10;
            int y = i % 10;
            if (x == y) {
                System.out.println(i);
            }
        }
    }
}