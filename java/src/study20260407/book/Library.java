package study20260407.book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void display() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " ( " + book.getAuthor() + " ) " + book.getPrice());
        }
        System.out.println("총 가격: " + calculationPrice());
    }

    public int calculationPrice() {
        int total = 0;
        for (Book book : books) {
            total += book.getPrice();
        }
        return total;
    }
}
