package practice_5.Zoo;

public class Zoo {
    public Animal animal;

    //указываем что нам надо ЖИВОТНОЕ...
    // тут можно и приват, для большей защиты, чтобы никто не порушил данные
    public void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Animal add"); // для понимания, что происходит...
    }

    //покажи мне что животное делает
    public void showAnimalBehavior() {
        animal.makeSound();
        animal.move();
    }

}
 /*заумь пошла....я хотел вывести их по одному, а не нет...не работает. Я оставляю это здесь
чтобы была понятна идея.
животное должно быть ОДНО. надо снести одного


//    public void removeAnimal() {
//        this.animal = null;//если мы в начале добавили конкретного зверя, то не указываем кого сносим.
//        System.out.println("Remove Animal");
//    }


    //создано по наитию. Неосознанно....хз что я тут нагородил. Но IDE не орет...*/

