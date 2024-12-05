package book.biz;

public interface IBookBiz {
    void printAllBooks();
    void searchNovelByAuthor(String author);
    void searchNovelByPrice(int minPrice, int maxPrice);
    void printHeader();
    void printTail();
}
