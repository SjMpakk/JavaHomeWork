/**
 * Java homework for the first lesson
 *
 * @author Alexey Denisov
 * @version dated Sep 13, 2018
 */
public class HomeWork1 {
    public static void main(String[] args) {

        System.out.println("Задание 2:");
        task2();
        System.out.println("Задание 3:");
        System.out.println(task3(2, 3, 2, 4));
        System.out.println("Задание 4:");
        System.out.println(task4(4.424, 12));
        System.out.println("Задание 5:");
        task5(2);
        System.out.println("Задание 6:");
        System.out.println(task6(-4));
        System.out.println("Задание 7:");
        task7("Цезарь");
        System.out.println("Задание 8 - повышенной сложности:");
        task8(1304);
    }

    public static void task2() {
        byte a = 13;
        System.out.println("8-битное знаковое число: " + a);
        short b = 16548;
        System.out.println("16-битное целое число: " + b);
        int c = -1248681359;
        System.out.println("32-битное целое знаковое число: " + c);
        long d = -65132;
        System.out.println("64-битное знаковое целое число: " + d);
        float e = 65.2f;
        System.out.println("32-битное знаковое число с плавающей запятой одинарной точности: " + e);
        double f = 1.235;
        System.out.println("64-битное знаковое число с плавающей запятой двойной точности: " + f);
        boolean g = false;
        System.out.println(g);
        char h = 'D';
        System.out.println(h);
    }

    public static int task3(int a, int b, int c, int d) {
        return (a * (b + (c / d)));
    }

    public static boolean task4(double a1, double a2) {
        return ((10 <= a1 + a2) && (20 >= a1 + a2));
    }

    public static void task5(int a) {
        if (a >= 0) {
            System.out.println("a is positive");
        } else {
            System.out.println("a is negative");
        }
    }

    public static boolean task6(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void task7(String name) {
        System.out.println("Привет, " + name);
    }

    public static void task8(int a) {
        if ((a % 100 == 0) && (a % 400 != 0)) {
            System.out.println("is not a leap year");
        } else if ((a % 4 == 0) || (a % 400 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("is not a leap year");
        }
    }
}