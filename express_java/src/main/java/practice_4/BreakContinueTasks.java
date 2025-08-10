package practice_4;

import java.util.Scanner;

public class BreakContinueTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Сумма чисел до первого отрицательного (использовать break)
        System.out.println("Введи положительное число, я посчитаю сумму всего что ввел");
        int sum = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println(sum);

        //Пропуск чисел, делящихся на 3 (использовать continue)
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        //Вывод только положительных чисел (использовать continue)
        System.out.println("Я принимаю только положительные числа. Вводи!");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num < 0) {
                continue;
            }
            System.out.println(num);
        }

        //Ввод строк до команды "stop" (использовать break)
        System.out.println("Я принимаю все, пока не напишешь stop. Вводи!");
        while (true) {
            String words = scanner.next();
            if (words.equals("stop")) {
                break;
            }
            System.out.println(words);
        }

        scanner.close();

    }
}
