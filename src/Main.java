public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        System.out.print("целые числа от 1 до 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("Задача 2");

        System.out.print("целые числа от 10 до 1: ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("Задача 3");

        System.out.print("четные числа от 0 до 17: ");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("Задача 4");

        System.out.print("числа от 10 до −10: ");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println(" ");
        System.out.println("Задача 6");

        System.out.print("последовательность чисел: ");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("Задача 7");

        System.out.print("последовательность чисел: ");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("Задача 8");
        int deposit = 29000;
        double savings = 0;

        for (int i = 1; i <= 12; i++) {
            savings += deposit;
            System.out.println(String.format("Месяц %d, сумма накоплений равна %.2f руб.", i, savings));
        }

        System.out.println(" ");
        System.out.println("Задача 9");

        savings = 0;
        for (int i = 1; i <= 12; i++) {
            savings += deposit;
            savings = savings * 1.01;
            System.out.println(String.format("Месяц %d, сумма накоплений равна %.2f руб.", i, savings));
        }

        System.out.println(" ");
        System.out.println("Задача 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }

    }
}