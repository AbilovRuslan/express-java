package practice_4;

import java.util.Scanner;

public class ForTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Вывод чисел от 1 до 100, делящихся на 3
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }


        //2. Сумма чисел от 1 до n
        System.out.println("Введите число n");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);


        // Таблица умножения для числа
        System.out.println("Введите число ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    number + " x " + i + " = " + number * i);
        }

        //Проверка на простое число
        System.out.println("Введи число");
        int number1 = scanner.nextInt();
        boolean isSimple = true;

        for (int i = 2; i <= number1 - 1; i++) {
            if (number1 % i == 0) {
                isSimple = false;
                break;
            }
        }
        if (isSimple) {
            System.out.println("простое");
        } else {
            System.out.println(" не простое ");
        }

        //Вывод чисел от 1 до 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        scanner.close();

    }
}
