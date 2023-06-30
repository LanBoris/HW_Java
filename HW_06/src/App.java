import java.util.HashSet;

import NotebookLib.Notebook;

public class App {
    public static void main(String[] args) throws Exception {
        // Создаем несколько ноутбуков
        Notebook notebook1 = new Notebook("Dell", "Inspiron", "Intel Core i7", 16, 256, 14);
        Notebook notebook2 = new Notebook("ACER", "Acpire 3", "AMD Ryzen 3", 8, 512, 15.6);
        Notebook notebook3 = new Notebook("Apple", "MacBook Air", "Apple M2", 8, 512, 13);
        HashSet<Notebook> notebookSet = new HashSet<>();

        // Добавляем ноутбуки в Set
        notebookSet.add(notebook1);
        notebookSet.add(notebook2);
        notebookSet.add(notebook3);

        // Выводим имеющиеся ноутбуки на экран
        System.out.println("\n" +  notebook1 + "\n");
        System.out.println(notebook2 + "\n");
        System.out.println(notebook3 + "\n");

        // Проверям на одинаковость
        if (notebook1.equals(notebook2) == true) 
            System.out.println("Совпадают.");
        else System.out.println("Не совпадают.");

        // Проверяем содержится ли определенный ноутбук в Set
        if (notebookSet.contains(notebook3) == true) 
            System.out.println(notebook3.manufacture + " " + notebook3.model + " - есть в наличии");
        else System.out.println(notebook3.manufacture + " " + notebook3.model + " - нет в наличии.");

        // Проверяем есть ли камера в ноутбуке
        if (notebook1.hasCamera() == true) 
            System.out.println("В ноутбуке " + notebook1.manufacture + " " + notebook1.model + " камера есть.");
        else System.out.println("В ноутбуке " + notebook1.manufacture + " " + notebook1.model + " камеры нет.");
        if (notebook3.hasCamera() == true) 
            System.out.println("В ноутбуке " + notebook3.manufacture + " " + notebook3.model + " камера есть.");
        else System.out.println("В ноутбуке " + notebook3.manufacture + " " + notebook3.model + " камеры нет.");

    }
}
