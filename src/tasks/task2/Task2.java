package tasks.task2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int a = input("первое");
        int b = input("второе");
        NOK(a, b);
        NOD(a, b);
    }


    private static int input(String num) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите " + num + " целое число:");
        if (s.hasNextInt()) {
            return s.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
            return input(num);
        }
    }

    private static void NOD(int x, int y) {
        for (int i = Math.min(x, y); i >= 1; i--) {
            if (x % i == 0 & y % i == 0) {
                System.out.println("Наибольший общий делитель: " + i);
                break;
            }
        }
    }

    private static void NOK(int x, int y) {
        for (int i = Math.max(x, y); i <= x * y; i++) {
            if (i % x == 0 & i % y == 0) {
                System.out.println("Наименьшее общее кратное: " + i);
                break;
            }
        }
    }
}
