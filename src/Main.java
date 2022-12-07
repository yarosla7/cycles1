public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {

        /**Задача 1
         С помощью цикла for выведите в консоль все числа от 1 до 10.*/

        System.out.println("\nЗадача_1:");

        for (int a = 1; a <= 10; a = a + 1) {
            System.out.println(a);
        }
    }

    public static void task2() {

        /**Задача 2
        С помощью цикла for выведите в консоль все числа от 10 до 1.*/

        System.out.println("\nЗадача_2:");

        for (int a = 10; a >= 1; a = a - 1) {
            System.out.println(a);
        }
    }

    public static void task3() {

        /**Задача 3
         Выведите в консоль все четные числа от 0 до 17.*/

        System.out.println("\nЗадача_3:");

        for (int a = 2; a <= 17; a = a + 2) {
            System.out.println(a);
        }
    }

    public static void task4() {

        /**Задача 4
         Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.*/

        System.out.println("\nЗадача_4:");

        for (int a = 10; a >= -10; a = a - 1) {
            System.out.println(a);
        }
    }

    public static void task5() {

        /**Задача 5
         Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
         В консоль результат должен выводиться в формате: «… год является високосным».*/

        System.out.println("\nЗадача_5:");

        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + " год является високосным.");
        }
    }

    public static void task6() {

        /**Задача 6
         Напишите программу, которая выводит в консоль последовательность чисел:

         7 14 21 28 35 42 49 56 63 70 77 84 91 98*/

        System.out.println("\nЗадача_6:");

        for (var s = 7; s <= 100; s = s + 7) {
            System.out.print(s+" ");
        }
    }

    public static void task7() {

        /**Задача 7
         Напишите программу, которая выводит в консоль последовательность чисел:

         1 2 4 8 16 32 64 128 256 512*/

        System.out.println("\n\nЗадача_7:");

        for (var t = 1; t <= 512; t = t * 2) {
            System.out.print(t + " ");
        }
    }

    public static void task8() {

        /**Задача 8
         Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».

         Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».*/

        System.out.println("\n\nЗадача_8:");

        int year = 12;
        int money = 0;
        for (int month = 1; month <= year; month++) {
              money = money + 29000;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей" );
            }
        }

    public static void task9() {

        /**Задача 9
         Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку»,
         а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате:
         «Месяц …, сумма накоплений равна … рублей».*/

        System.out.println("\nЗадача_9:");

        int year = 12;
        float money = 0;
        float interests;
        for (int month = 1; month <= year; month++) {
            money = money + 29000;
            interests = money * 0.01F;
            money = money + interests;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей." );
        }
    }

    public static void task10() {

        /**Задача 10
        Напишите программу, которая выводит в консоль таблицу умножения на 2:

        2*1=2

        2*2=4

        2*3=6

        2*4=8

        2*5=10

        2*6=12

        2*7=14

        2*8=16

        2*9=18

        2*10=20*/

        System.out.println("\nЗадача_10:");

        int number = 2;
        int multiplication;
        for (int n = 1; n <= 10; n++) {
            multiplication = number * n;
                System.out.println(number + " * " + n + " = " + multiplication);
        }
    }
}