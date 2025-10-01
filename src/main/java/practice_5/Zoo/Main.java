package practice_5.Zoo;
/*
Условие:
В зоопарке есть одно животное, но оно может быть разным: птица или слон.
Каждое животное издаёт уникальные звуки и передвигается по-своему.
Например, слон трубит и ходит, а птица чирикает и летает.
Нужно спроектировать систему, которая может работать
с любым животным, добавлять его в зоопарк и демонстрировать его поведение.
*/

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(); //создаем Зоо

        Animal elephant = new Elephant();//создали слона
        Animal bird = new Bird();//создали голубя

        zoo.addAnimal(elephant);
        zoo.showAnimalBehavior();

        //МАГИЯ!!!!!! как то оно сработало...

        zoo.addAnimal(bird);
        zoo.showAnimalBehavior();
        //zoo.removeAnimal(); //идея выводить по одному не сработала.

    }
}
