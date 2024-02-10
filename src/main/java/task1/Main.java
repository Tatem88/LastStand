package task1;

import java.awt.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();
        System.out.println(libraryItems("MMM"));
        LibrarySearchService searchService = new LibrarySearchService(libraryItems);
        List<LibraryItem> itemsFound = searchService.searchByAuthor("Author Name");
        System.out.println(itemsFound("Mavrody"));
    }
}

