/**
 * Java homework 3 lesson
 *
 * @author Alexey Denisov
 * @version dated Sep 23, 2018
 */
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ваша задача угадать число за 3 попытки");
        do {
            Random y = new Random();
            int number = y.nextInt(10);
            System.out.println("Угадайте число от 0 (включая 0, до 9 (Только целые числа)" + "\nВведите число:");
            int i;
            for (i = 1; i <= 3; i++) {
                int x = scan.nextInt();
                if (x == number) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (x > number) {
                    System.out.println("Введенное число больше загаданного");
                } else if (x < number) {
                    System.out.println("Введенное число меньше загаданного");
                }
                if (i == 3) {
                    System.out.println("Вы проиграли, было загадано число: " + number);
                }
            }
            System.out.println("Попробуем еще раз? \n 1 - ДА \n 0 - НЕТ");
            int repeat = scan.nextInt();
            while ((repeat < 0) || (repeat > 1)) {
                System.out.println("Введен некорректный ответ \nнеобходимо ввести 1 - ДА или 0 - НЕТ");
                repeat = scan.nextInt();
            }
            if (repeat == 1) {
                System.out.println("Начинаем новую игру");
            } else {
                System.out.println("Вы завершили игру, до новых встреч!");
                return;
            }
        } while (true);
        scan.close();
    }
}