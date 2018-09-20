/**
 * Java homework: 2 lesson
 *
 * @author Alexey Denisov
 * @version dated Sep 17, 2018
 */
public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Решение задания 1:");
        task1();
        System.out.println("\nРешение задания 2:");
        task2();
        System.out.println("\nРешение задания 3:");
        task3();
        System.out.println("\nРешение задания 4:");
        task4();
        System.out.println("Решение задания 5:");
        task5();
    }

    public static void task1() {
        int[] x = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int y = 0; y < x.length; y++) {
            if (x[y] == 0) {
                x[y] = 1;
            } else x[y] = 0;
        } for (int y : x) {
            System.out.print(y + "");
        }
    }

    public static void task2() {
        int[] x = new int[8];
        int a = 0;
        for (int i = 0; i < x.length; i++, a = a + 3) {
            x[i] = a;
            System.out.print(x[i] + " ");
        }
    }


    public static void task3() {
        int[] x = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < x.length; i++) {
            if (x[i] <= 6) {
                x[i] = x[i] * 2;
            }
            System.out.print(x[i] + " ");
        }
    }

    public static void task4() {
        int a = 1;
        int[][] x = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i == j) || (i == 4 - 1 - j)) {
                    x[i][j] = 1;
                } else {
                    x[i][j] = 0;
                }
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }

    public static void task5() {
        int[] x = {19, 3, 6, 2, 9, 22, 4};
        int max = x[0];
        int min = x[0];
        for (int y = 0; y != x.length; y++) {
            if (x[y] > max) {
                max = x[y];
            }
            if (x[y] < min) {
                min = x[y];
            }
        }
        System.out.println("минимальное значение: " + min);
        System.out.println("максимальное значение: " + max);
    }
}