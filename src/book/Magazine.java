package book;

public class Magazine extends Book {
    private String category;
    private String description;

    public Magazine(String title, int price, String category, String description) {
        super(title, price);
        this.category = category;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return super.toString() + " [Kategori] " + category + " [Keterangan] " + description;
    }
}
