package practice_13.task7isp;

public class Robot implements Eat {

    @Override
    public void eat() {
        System.out.println("Не кормить! Он заразный!");
    }
}
