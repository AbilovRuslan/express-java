package practice_5.Farm;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        farm.setAnimal(new Cow());
        farm.manageAnimal();

        farm.setAnimal(new Chicken());
        farm.manageAnimal();
    }
}
