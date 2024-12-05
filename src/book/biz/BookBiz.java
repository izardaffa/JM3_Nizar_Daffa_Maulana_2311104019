package book.biz;

import book.Book;
import book.Magazine;
import book.Novel;

public class BookBiz implements IBookBiz {
    private Book[] books = new Book[6];

    public BookBiz() {
        books[0] = new Magazine("Cooking Light", 15000, "living, cooking", "America Cooking");
        books[1] = new Magazine("Auto Bild", 16000, "science, car", "Germany Car");
        books[2] = new Novel("The Confession", 10500, "Grisham, John");
        books[3] = new Novel("Les Miserables", 17500, "Hugo, Victor");
        books[4] = new Novel("Breakthrough", 47200, "Ifill, Gwen");
        books[5] = new Novel("The Racketeer", 38000, "Grisham, John");
    }

    @Override
    public void printAllBooks() {
        printHeader();
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
        printTail();
    }

    @Override
    public void searchNovelByAuthor(String author) {
        printHeader();
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof Novel) {
                Novel novel = (Novel) books[i];
                if (author.equalsIgnoreCase(novel.getAuthor())) {
                    System.out.println(books[i].toString());
                }
            }
        }
        printTail();
    }

    @Override
    public void searchNovelByPrice(int minPrice, int maxPrice) {
        printHeader();
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof Novel) {
                if (books[i].getPrice() >= minPrice && books[i].getPrice() <= maxPrice) {
                    System.out.println(books[i].toString());
                }
            }
        }
        printTail();
    }

    @Override
    public void printHeader() {
        System.out.println("------------------------------ Informasi Buku ------------------------------");
    }

    @Override
    public void printTail() {
        System.out.println("--------------------------------------------------------------------------------");
    }

}
