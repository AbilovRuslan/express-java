package practice_12.Entity;

public class Main {
    public static void main(String[] args) {
        EntityManager manager = new EntityManager();

        manager.add(new User("Alice", 25, true));
        manager.add(new User("Bob", 30, false));
        manager.add(new User("Anna", 22, true));

        System.out.println("─── Все пользователи ───");
        System.out.println(manager.getAll());

        System.out.println("\n─── Фильтр по возрасту (20–25) ───");
        System.out.println(manager.filterByAge(20, 25));

        System.out.println("\n─── Фильтр по имени ('an') ───");
        System.out.println(manager.filterByName("an"));

        System.out.println("\n─── Активные ───");
        System.out.println(manager.filterByActive(true));

        System.out.println("\n─── Удаление ───");
        boolean removed = manager.remove(new User("Bob", 30, false));
        System.out.println("Удалён Bob: " + removed);
        System.out.println("Осталось: " + manager.getAll());

        System.out.println("\n─── Очистка ───");
        manager.clear();
        System.out.println("Пусто: " + manager.isEmpty());
    }
}
