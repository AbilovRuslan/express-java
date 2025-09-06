package practice_7;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task1 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data.txt")) {
            System.out.println("Файл загружен");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Ошибка при работе с файлом");
        }
    }
}


//было так, но предупреждал что не закрыт FileReader...ну можно было оставить
//public class Task1 {
//    public static void main(String[] args) {
//        try {
//            FileReader reader = new FileReader("data.txt");
//            System.out.println("Файл загружен");
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл не найден");
//        }
//    }
//}