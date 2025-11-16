package practice_14.task6;

public class MacWindow implements Window{
    @Override
    public void draw() {
        System.out.println("Отрисовка окна macOS");
    }

    @Override
    public void maximize() {
        System.out.println("Разворачивание окна macOS с анимацией");
    }
}
