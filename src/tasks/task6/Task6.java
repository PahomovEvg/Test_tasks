package tasks.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int countThing = inputInt("Введите кол-во вещей:");
        int volumeBag = inputInt("Введите грузоподъёмность рюкзака:");
        Thing[] things = new Thing[countThing];
        for (int i = 0; i < countThing; i++) {
            String title = inputStr("Введите название вещи " + (1 + i) + " :");
            int weight = inputInt("Введите вес вещи " + (1 + i) + " :");
            int price = inputInt("Введите стоимость вещи " + (1 + i) + " :");
            things[i] = new Thing(title, weight, price);
        }
        packaging(sortThing(things), volumeBag);
    }

    private static int inputInt(String str) {
        Scanner n = new Scanner(System.in);
        System.out.print(str);
        return n.nextInt();
    }

    private static String inputStr(String str) {
        Scanner n = new Scanner(System.in);
        System.out.print(str);
        return n.nextLine();
    }

    private static Thing[] sortThing(Thing[] things) {
        for (int out = things.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if ((things[in].price * 1.0) / (things[in].weight) < (things[in + 1].price * 1.0) / (things[in + 1].weight)) {
                    Thing n = things[in];
                    things[in] = things[in + 1];
                    things[in + 1] = n;
                }
            }
        }
        return things;
    }

    private static void packaging(Thing[] things, int bag) {
        System.out.println("В рюкзак лучше всего поместить:");
        int wtInBag = 0;
        for (Thing thing : things) {
            if (wtInBag + thing.weight <= bag) {
                wtInBag = wtInBag + thing.weight;
                System.out.println(thing.title);
            }
        }
    }
}

class Thing {

    String title;
    int weight;
    int price;


    public Thing(String title, int weight, int price) {
        this.title = title;
        this.weight = weight;
        this.price = price;
    }

}
