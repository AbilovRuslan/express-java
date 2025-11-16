package practice_14.task6;

public class MacButton implements Button{
    @Override
    public void click() {
        System.out.println("Кнопка macOS нажата с анимацией");
    }

    @Override
    public void render() {
        System.out.println("Отрисовка кнопки в стиле macOS ");
    }
}
