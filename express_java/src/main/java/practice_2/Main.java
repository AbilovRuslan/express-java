package practice_2;


public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Mazda", 2010);
        myCar.setYear(2020);
        myCar.print();


        Rectangle rect = new Rectangle(20, 40);
        rect.setWidth(45);
        rect.print();

        Book book = new Book("Муму", "Гоголь");
        book.setAuthor("Тургенев");
        book.print();

        BankAccount account = new BankAccount("Иванов", 1000);
        account.deposit(300);
        account.withdraw(800);
        account.print();

        Point point = new Point(4,6);
        point.setX(10);
        point.print();

        StudentGroup group = new StudentGroup("Умники", 2);
        group.setStudentCount(21);
        group.print();

        Circle circle = new Circle(200);
        circle.setRadius(250);
        circle.print();


        Teacher teacher = new Teacher("Якутенок Зинаида Ивановна", "Химия");
        teacher.setSubject("Физика");
        teacher.print();

        Product product = new Product("Тостер", 200);
        product.setPrice(300);

        Laptop laptop = new Laptop("Asus",2000);
        laptop.setBrand("Sony");
        laptop.print();





    }

}
