package practice_12.Warehouse;

public class Main {
    public static void main(String[] args) {
        // Создаём объект склада через интерфейс
        InventoryService inventoryService = new InventoryServiceImpl();

        // Добавляем товары через объект
        inventoryService.addProduct(new Product("Apple", 3.3, "fruit"));
        inventoryService.addProduct(new Product("Kiwi", 2, "fruit"));
        inventoryService.addProduct(new Product("Short", 5, "clothes"));
        inventoryService.addProduct(new Product("Tshirt", 4, "clothes"));

        // Получаем один товар из категории fruit
        Product p1 = inventoryService.getProductByCategory("fruit");
        System.out.println("Получен товар: " + p1);

        // Фильтрация товаров по категории и максимальной цене
        System.out.println("Товары в категории clothes дешевле 10: ");
        inventoryService.getProductsByCategoryAndMaxPrice("clothes", 10)
                .forEach(System.out::println);

        //  Закрываем склад
        inventoryService.setInventoryOpen(false);

        // Попытка добавить товар при закрытом складе
        inventoryService.addProduct(new Product("Gloves", 2, "clothes"));

        // Проверяем содержимое после закрытия
        System.out.println("Список продуктов после закрытия склада:");
        inventoryService.getProductsByCategoryAndMaxPrice("clothes", 10)
                .forEach(System.out::println);
    }
}
