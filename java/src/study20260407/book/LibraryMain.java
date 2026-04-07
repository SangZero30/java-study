package study20260407.book;

import java.util.List;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("자바의 정석","남궁성",30000));
        library.addBook(new Book("클린 코드", "로버트 마틴", 25000));
        library.display();
    }
}
