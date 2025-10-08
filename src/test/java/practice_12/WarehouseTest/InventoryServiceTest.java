package practice_12.WarehouseTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_12.Warehouse.InventoryService;
import practice_12.Warehouse.InventoryServiceImpl;
import practice_12.Warehouse.OutOfStockException;
import practice_12.Warehouse.Product;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryServiceTest {

    private InventoryService inventoryService;

    @BeforeEach
    void setUp() {
        inventoryService = new InventoryServiceImpl();
        inventoryService.addProduct(new Product("Laptop", 999.99, "Electronics"));
        inventoryService.addProduct(new Product("Mouse", 29.99, "Electronics"));
    }

    @Test
    void testAddProduct() {
        inventoryService.addProduct(new Product("Keyboard", 79.99, "Electronics"));

        List<Product> electronics = inventoryService.getProductsByCategoryAndMaxPrice("Electronics", 1000);
        assertEquals(3, electronics.size());
    }

    @Test
    void testGetProductByCategory() {
        Product product = inventoryService.getProductByCategory("Electronics");
        assertNotNull(product);
        assertEquals("Laptop", product.getName());
    }

    @Test
    void testOutOfStockException() {

        InventoryService testService = new InventoryServiceImpl();

        // Добавляем 2 товара
        testService.addProduct(new Product("Item1", 10, "Test"));
        testService.addProduct(new Product("Item2", 20, "Test"));

        // Извлекаем оба
        testService.getProductByCategory("Test");
        testService.getProductByCategory("Test");

        // Теперь должно быть исключение
        assertThrows(OutOfStockException.class, () ->
                testService.getProductByCategory("Test"));
    }

    @Test
    void testFilterByPrice() {
        List<Product> cheapProducts = inventoryService.getProductsByCategoryAndMaxPrice("Electronics", 50);
        assertEquals(1, cheapProducts.size());
        assertEquals("Mouse", cheapProducts.get(0).getName());
    }

    @Test
    void testInventoryClosed() {
        inventoryService.setInventoryOpen(false);
        inventoryService.addProduct(new Product("Monitor", 199.99, "Electronics"));

        List<Product> products = inventoryService.getProductsByCategoryAndMaxPrice("Electronics", 1000);
        assertEquals(2, products.size()); // Монитор не добавился, так как склад закрыт
    }

    @Test
    void testGetProductsByCategory() {
        List<Product> electronics = inventoryService.getProductsByCategoryAndMaxPrice("Electronics", 1000);
        assertEquals(2, electronics.size());
        assertTrue(electronics.stream().anyMatch(p -> p.getName().equals("Laptop")));
        assertTrue(electronics.stream().anyMatch(p -> p.getName().equals("Mouse")));
    }
}