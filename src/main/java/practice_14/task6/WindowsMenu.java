package practice_14.task6;

public class WindowsMenu implements Menu{
    @Override
    public void display() {
        System.out.println("Отображается меню Windows в выпадающем списке");
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Выбран пункт '" + item + "' в меню Windows");
    }
}
