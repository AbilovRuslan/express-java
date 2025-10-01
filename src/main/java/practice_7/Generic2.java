package practice_7;

public class Generic2 {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        printArray(intArray);

        String[] strArray = {"мир", "труд", "май"};
        printArray(strArray);

        Double[] doubleArray = {1.1, 2.2, 3.4, 4.5};
        printArray(doubleArray);
    }
}
