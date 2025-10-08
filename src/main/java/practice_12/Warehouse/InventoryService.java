package practice_12.Warehouse;

import java.util.List;

public interface InventoryService {

    // Управление доступом к складу
    void setInventoryOpen(boolean open);

    // Добавление продукта
    void addProduct(Product product);

    // Получение одного продукта по категории
    Product getProductByCategory(String category);

    // Получение списка продуктов по категории и максимальной цене
    List<Product> getProductsByCategoryAndMaxPrice(String category, double maxPrice);
}
