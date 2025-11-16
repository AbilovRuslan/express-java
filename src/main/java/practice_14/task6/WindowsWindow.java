package practice_14.task6;

public class WindowsWindow implements Window{
    @Override
    public void draw() {
        System.out.println("Отрисовка окна Windows");
    }

    @Override
    public void maximize() {
        System.out.println("Разворачивание окна Windows на весь экран");
    }
}
