package book.test;

import book.biz.BookBiz;

public class BookTest {
    public static void main(String[] args) {
        String action;
        boolean isActive = true;
        BookBiz bookBiz = new BookBiz();

        while (isActive) {
            printMenu();
            
            System.out.print("## Pilih menu : ");
            action = MissionUtil.getStringInput();

            if (action.equalsIgnoreCase("1")) {
                bookBiz.printAllBooks();
            } else if (action.equalsIgnoreCase("2")) {
                String author;

                System.out.print(">> Masukkan nama penulis yang ingin dicari : ");
                author = MissionUtil.getStringInput();

                bookBiz.searchNovelByAuthor(author);
            } else if (action.equalsIgnoreCase("3")) {
                int minPrice;
                int maxPrice;

                System.out.print(">> Masukkan harga minimum untuk novel yang ingin dicari : ");
                minPrice = MissionUtil.getIntegerInput();

                if (minPrice < 0) {
                    System.out.println("[Error] Informasi harga tidak boleh berisi angka negatif. Silahkan masukkan lagi.");
                } else {
                    System.out.print(">> Masukkan harga maksimum untuk novel yang ingin dicari : ");
                    maxPrice = MissionUtil.getIntegerInput();
                    
                    if (maxPrice < 0) {
                        System.out.println("[Error] Informasi harga tidak boleh berisi angka negatif. Silahkan masukkan lagi.");
                    } else {
                        if (minPrice > maxPrice) {
                            System.out.println("Nilai maksimum tidak boleh kurang dari nilai minimum. Silakan masukkan lagi.");
                        } else {
                            bookBiz.searchNovelByPrice(minPrice, maxPrice);
                        }
                    }
                }
            } else if (action.equalsIgnoreCase("9")) {
                isActive = false;

                System.out.println(">> Berhenti. Bye~");
            } else {
                System.out.println("[Error] Anda salah memasukkan menu. Silahkan masukkan lagi.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("===== << Program Informasi Buku >> =====");
        System.out.println("1. Mencari seluruh informasi buku");
        System.out.println("2. Mencari nama penulis novel");
        System.out.println("3. Mencari harga novel (harga terendah ke harga tertinggi)");
        System.out.println("9. Keluar");
        System.out.println("========================================");
    }
}
