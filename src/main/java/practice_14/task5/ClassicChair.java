package practice_14.task5;

public class ClassicChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Сижу на классическом стуле с резной спинкой");
    }

    @Override
    public void description() {
        System.out.println("Классический стул: деревянный, с резными узорами, бархатная обивка");
    }
}
