package practice_4;

import java.util.Scanner;

public class SwitchTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Вывод дня недели по номеру
        System.out.println("Введите число от 1-7:");
        int day = scanner.nextInt();
        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Некорректный день");
        }

        //Стоимость билета по дню недели
        System.out.println("Введите день недели номер: ");
        int ticket = scanner.nextInt();
        switch (ticket) {
            case 1, 2, 3, 4, 5 -> System.out.println("Цена билета: 300 руб");
            case 6, 7 -> System.out.println("Цена билета: 450руб");
            default -> System.out.println("Некорректный день");
        }

        // Перевод числовых оценок в буквенные (A–F)
        System.out.println("Введите оценку: ");
        int score = scanner.nextInt();
        if (score >= 90 && score <= 100) System.out.println("A");
        else if (score >= 80) System.out.println("B");
        else if (score >= 70) System.out.println("C");
        else if (score >= 60) System.out.println("D");
        else if (score >= 0) System.out.println("F");
        else System.out.println("Некорректная оценка");

        //Обработка текстовых команд
        System.out.println("Введите команду\"start\", \"stop\", \"restart\" или \"status\"");
        scanner.nextLine();
        String command = scanner.nextLine();
        switch (command) {
            case "start" -> System.out.println("Система запущена");
            case "stop" -> System.out.println("Остановка системы");
            case "restart" -> System.out.println("Перезапуск системы");
            case "status" -> System.out.println("Статус текущего состояния");
            default -> System.out.println("Неизвестная команда");
        }

        //Простой калькулятор с использованием switch
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите оператор вычисления +, -, *, / : ");
        char op = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        switch (op) {
            case '+' -> System.out.println("Результат: " + (num1 + num2));
            case '-' -> System.out.println("Результат: " + (num1 - num2));
            case '*' -> System.out.println("Результат: " + (num1 * num2));
            case '/' -> {
                if (num2 != 0) System.out.println("Результат: " + (num1 / num2));
                else System.out.println("Делить на ноль нельзя!");
            }
            default -> System.out.println("Нет такого оператора ");
        }

        scanner.close();

    }
}
