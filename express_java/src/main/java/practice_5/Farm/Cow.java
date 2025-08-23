package practice_5.Farm;

public class Cow implements FarmAnimal{
    @Override
    public void feed(){
        System.out.println("Grass");
    };
    @Override
    public void care(){
        System.out.println("кормушка нужна");
    }
    @Override
    public void produce(){
        System.out.println("дает молоко. Иногда!");
    }
}
