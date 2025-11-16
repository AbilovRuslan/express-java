package practice_14.task5;

public class ModernChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Сижу на современном стуле с эргономичной спинкой");
    }

    @Override
    public void description() {
        System.out.println("Современный стул: минималистичный дизайн");
    }
}
