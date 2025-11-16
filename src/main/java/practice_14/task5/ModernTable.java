package practice_14.task5;

public class ModernTable implements Table{
    @Override
    public void use() {
        System.out.println(" современный стеклянный стол");
    }

    @Override
    public void description() {
        System.out.println("Современный стол: стеклянная столешница, хромированные ножки");
    }
}
