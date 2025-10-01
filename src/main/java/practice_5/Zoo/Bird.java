package practice_5.Zoo;
//реализует интерефйс Animal, был бы Animal классом, то наследовал бы через extends.
//Но нет общий логики для всех класов, чтобы делать наследование.
//Соответственно, делаем интерфейс-контракт. После чего переопределяем (даем объекту логику)
//что он должен делать


public class Bird implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Птица орет истошно...");
    }

    @Override
    public void move() {
        System.out.println("Птица летает с молитвой....");
    }

}
