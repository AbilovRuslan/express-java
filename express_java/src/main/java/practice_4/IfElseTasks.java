package practice_4;

import java.util.Scanner;

public class IfElseTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Определение знака числа
        System.out.println("Введи число: ");
        double num = scanner.nextDouble();
        if (num > 0) System.out.println("Число положительное");
        else if (num < 0) System.out.println("Число отрицательное ");
        else System.out.println("Число равно нулю");


        //Поиск наибольшего из двух чисел
        System.out.println("Введи первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введи второе число: ");
        double b = scanner.nextDouble();
        if (a > b) System.out.println("Наибольшее число: " + a);
        else if (b > a) System.out.println("Наибольшее число: " + b);
        else System.out.println("Числа равны");

        // Вывод оценки по шкале 1–5

        System.out.println("Введи оценку от 1-5: ");
        int grade = scanner.nextInt();
        if (grade == 5) System.out.println("Отлично!");
        else if (grade == 4) System.out.println("Хорошо");
        else if (grade == 3) System.out.println("Удовлетворительно");
        else if (grade == 2 || grade == 1) System.out.println("Неудовлетворительно");
        else System.out.println("Некорректное значение");

        //Проверка на чётность
        System.out.println("Введите целое число: ");
        int num1 = scanner.nextInt();
        if (num1 % 2 == 0) System.out.println("Четное");
        else System.out.println("Нечетное");


        //Определение размера скидки по возрасту
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        if (age < 18) System.out.println("Скидка 25%");
        else if (age >= 65) System.out.println("Скидка 30%");
        else System.out.println("Иди работай больше! Нет скидки");


        //Оценка результата теста по баллам
        System.out.println("Введите количество баллов:");
        int score = scanner.nextInt();
        if (score >= 90) System.out.println("Гений! Отлично!");
        else if (score >= 75) System.out.println("Хорошо! Можешь лучше");
        else if (score >= 60) System.out.println("Удовлетворительно. Троечник!");
        else System.out.println("LOSER! неудовлетворительно! мать в школу!");

        scanner.close();


    }
}
