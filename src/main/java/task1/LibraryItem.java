package task1;

import java.awt.*;
import java.util.ArrayList;

abstract class LibraryItem {
    private String inventoryNumber;
    private String author;

    public LibraryItem(String inventoryNumber, String author) {
        this.inventoryNumber = inventoryNumber;
        this.author = author;
    }

    // Геттеры и сеттеры
    public String getInventoryNumber() { return inventoryNumber; }
    public String getAuthor() { return author; }
}

// Класс Book наследуется от LibraryItem
class Book extends LibraryItem {
    public Book(String inventoryNumber, String author) {
        super(inventoryNumber, author);
    }
}

// Класс Magazine наследуется от LibraryItem
class Magazine extends LibraryItem {
    public Magazine(String inventoryNumber, String author) {
        super(inventoryNumber, author);
    }
}

// Интерфейс для определения общего поведения поиска
interface Searchable {
    List<LibraryItem> searchByInventoryNumber(String inventoryNumber);
    List<LibraryItem> searchByAuthor(String author);
}

// Класс LibrarySearchService использует интерфейс для реализации поиска
class LibrarySearchService implements Searchable {
    private List<LibraryItem> libraryItems;

    public LibrarySearchService(List<LibraryItem> libraryItems) {
        this.libraryItems = libraryItems;
    }

    @Override
    public List<LibraryItem> searchByInventoryNumber(String inventoryNumber) {
        List<LibraryItem> foundItems = new ArrayList<>();

        for(LibraryItem item: libraryItems) {
            if (item.getInventoryNumber().equals(inventoryNumber)) {
                foundItems.add(item);
            }
        }

        return foundItems;
    }

    @Override
    public List<LibraryItem> searchByAuthor(String author) {
        List<LibraryItem> foundItems = new ArrayList<>();

        for(LibraryItem item: libraryItems) {
            if (item.getAuthor().equals(author)) {
                foundItems.add(item);
            }
        }

        return foundItems;
    }
}
