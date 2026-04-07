package study20260407.book;

public class Book {
        private String title;
        private String author;
        private int price;

        public Book(String title, String author, int price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        // Getter 추가 (Library에서 접근해야 하므로)
        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public int getPrice() { return price; }
}
