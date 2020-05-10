package tasks.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[]args){
        int x = input();
        parity(x);
        prime(x);
    }


    private static int input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите целое число:");
        if (s.hasNextInt()) {
            int n = s.nextInt();
            s.close();
            return n;
        } else {
            System.out.println("Вы ввели не целое число");
            return input();
        }
    }

    private static void parity(int n) {
        boolean isParity = false;
        if (n % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }

    private static void prime(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n / i * i == n) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число составное");
        }
    }

}