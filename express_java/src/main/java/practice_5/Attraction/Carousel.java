package practice_5.Attraction;

public class Carousel implements Attraction {
    @Override
    public String info() {
        return "Прокатись на нашей каруселииии";
    }

    @Override
    public void maintain() {
        System.out.println("Все сгорели карусели!");
    }
}
