package practice_14.task6;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Кнопка Windows нажата");
    }

    @Override
    public void render() {
        System.out.println("Отрисовка кнопки в стиле Windows");
    }
}
