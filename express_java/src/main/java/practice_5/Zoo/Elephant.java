package practice_5.Zoo;
//реализует интерфейс Animal, был бы Animal классом, то наследовал бы через extends.
//Но нет общий логики для всех классов, чтобы делать наследование.
//Соответственно, делаем интерфейс-контракт. После чего переопределяем (даем объекту логику)
//что он должен делать

public class Elephant implements Animal {
    @Override
    public void makeSound(){
        System.out.println("Слон трубит");
    }

    @Override
    public void move(){
        System.out.println("Слон старый. Ходит как может. Но чаще ест");
    }
}
