package practice_14.task5;

public class ClassicTable implements Table{
    @Override
    public void use() {
        System.out.println("Использую классический деревянный стол");
    }

    @Override
    public void description() {
        System.out.println("Классический стол: массив дерева, резные ножки, темное лаковое покрытие");
    }
}
