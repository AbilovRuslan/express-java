package practice_12.Warehouse;

import java.util.*;
import java.util.stream.Collectors;

public class InventoryServiceImpl implements InventoryService {
    private final Map<String, List<Product>> inventory = new HashMap<>();
    private boolean isInventoryOpen = true;

    @Override
    public void setInventoryOpen(boolean open) {
        this.isInventoryOpen = open;
    }

    @Override
    public void addProduct(Product product) {
        if (!isInventoryOpen) {
            System.out.println("Склад закрыт. Добавление товара невозможно: " + product);
            return;
        }
        inventory.computeIfAbsent(product.getCategory(), k -> new ArrayList<>()).add(product);
    }

    @Override
    public Product getProductByCategory(String category) {
        List<Product> products = inventory.get(category);
        if (products == null || products.isEmpty()) {
            throw new OutOfStockException("Товары в категории '" + category + "' закончились!");
        }
        return products.remove(0);
    }

    @Override
    public List<Product> getProductsByCategoryAndMaxPrice(String category, double maxPrice) {
        return inventory.getOrDefault(category, Collections.emptyList())
                .stream()
                .filter(p -> p.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}