import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("итерация цикла " + i);
        }
        // Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 0; i--) {
            System.out.println("итерация цикла " + i);
        }
        // Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("итерация цикла " + i);
        }
        // Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10 && i <= 10; i--) {
            System.out.println("итерация цикла " + i);
        }
        // Задание 5
        System.out.println("Задание 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        // Задание 6
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        // Задание 7
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        // Задание 8
        System.out.println("Задание 8");
        int accomulation = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + accomulation;
            System.out.println("Месяц, " + i + " сумма накоплений равна " + total + " рублей");
        }
        // Задание 9
        System.out.println("Задание 9");
        int accoumulation1 = 29000;
        int total1 = 0;
        for (int i = 0; i <= 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + accoumulation1;
            System.out.println("Месяц, " + i + " сумма накоплений равна " + total1 + " рублей");
        }
        // Задание 10
        System.out.println("Задание 10");
        int number = 2;
        int total2 = 0;
        for (int i = 0; i <= 10; i++) {
            total2 = i * number;
            System.out.println(i + " * " + number + " = " + total2);
        }
    }
}


