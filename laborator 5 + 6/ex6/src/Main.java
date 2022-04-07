import model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("B2", "A2"));
        books.add(new Book("B1", "A1"));
        books.add(new Book("B3", "A3"));

        System.out.println(books);
        Collections.sort(books, ((o1, o2) -> o1.getName().compareTo(o2.getName())));
//        Collections.sort(books, (Comparator.comparing(Book::getName)));

        System.out.println(books);
    }
}
