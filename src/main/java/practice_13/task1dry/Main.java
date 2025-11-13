package practice_13.task1dry;

public class Main {
    public static void main(String[] args) {
        Calculat calc = new Calculat();
        System.out.println(calc.add(5, 3));
        System.out.println(calc.add(1, 2, 3));
        System.out.println(calc.add(2.5, 3.7));

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(calc.add(nums));
    }
}
