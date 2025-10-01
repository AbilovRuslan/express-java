package practice_4;

import java.util.Scanner;

public class DoWhileTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Запрос положительного числа
        int number;
        do {
            System.out.println("Введите положительное число: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("Это число: " + number);


        //Проверка пароля
        String correctPassword = "qwerty";
        String inputPassword;
        scanner.nextLine();
        do {
            System.out.println("Введи пароль: ");
            inputPassword = scanner.nextLine();
        } while (!inputPassword.equals(correctPassword));
        System.out.println("Доступ разрешен!");

        // Вывод чисел от 1 до 10 с использованием do-while
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        // Завершение программы по команде "exit"
        String command;
        do {
            System.out.println("Введи 'exit': ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));
        System.out.println("работа завершена! Fuck you!");

        //Подсчёт количества цифр в числе
        System.out.println("Введи число: ");
        int number1 = scanner.nextInt();
        int count = 0;
        if (number1 == 0) {
            count = 1;
        } else {
            do {
                number1 /= 10;
                count++;
            } while (number1 != 0);
        }
        System.out.println("Количество цифр: " + count);


    }
}
