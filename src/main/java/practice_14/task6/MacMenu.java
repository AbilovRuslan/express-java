package practice_14.task6;

public class MacMenu implements Menu{
    @Override
    public void display() {
        System.out.println("Отображается строка меню macOS в верхней части экрана");
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Выбран пункт '" + item + "' в меню macOS с эффектом наведения");
    }
}
