package book;

public class Novel extends Book {
    private String author;

    public Novel(String title, int price, String author) {
        super(title, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return super.toString() + " [Penulis] " + author;
    }
}
