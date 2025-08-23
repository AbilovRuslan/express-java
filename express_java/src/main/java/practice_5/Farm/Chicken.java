package practice_5.Farm;

public class Chicken implements FarmAnimal{
    @Override
    public void feed(){
        System.out.println("Зерно");
    };

    @Override
    public void care(){
        System.out.println("поилка нужна");
    }
    @Override
    public void produce(){
        System.out.println("дает яйца. Неожиданно! да?)))");
    }
}
