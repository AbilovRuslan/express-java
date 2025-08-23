package practice_5.Museum;

public class Sculpture implements Exhibit{
    @Override
    public String describe(){
        return "Античная скульптура: Апплон! 1шт!";
    }

    @Override
    public void preserve() {
        System.out.println("Девочки! смахните пыль с Апполона....и ТАМ тоже!");
    }
}
