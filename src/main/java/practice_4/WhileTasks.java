package practice_4;

import java.util.Scanner;

public class WhileTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вычисление факториала с помощью while
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int result = 1;
        int i = 1;

        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.println("Факториал: " + result);

        //Вывод всех чётных чисел до заданного
        System.out.println("Введите число : ");
        int limit = scanner.nextInt();
        int num = 1;
        while (num <= limit) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }


        // Обратный отсчёт от введённого числа до 1
        System.out.println("Введите число : ");
        int countdown = scanner.nextInt();
        while (countdown >= 1) {
            System.out.println(countdown);
            countdown--;
        }

        scanner.close();
    }
}
