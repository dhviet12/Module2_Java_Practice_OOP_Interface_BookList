public class Main {
    public static void main(String[] args) {
        Book[] booklists = new Book[10];
        booklists[0] = new ProgrammingBook(1, "Sach chuong trinh 1", 50000, "Author 1", "Java", "Framework1");
        booklists[1] = new ProgrammingBook(2, "Sach chuong trinh 2", 100000, "Author 2", "Java", "Framework2");
        booklists[2] = new ProgrammingBook(3, "Sach chuong trinh 3", 150000, "Author 3", "Java", "Framework3");
        booklists[3] = new ProgrammingBook(4, "Sach chuong trinh 4", 200000, "Author 4", "JavaScript", "Framework4");
        booklists[4] = new ProgrammingBook(5, "Sach chuong trinh 5", 250000, "Author 5", "Java", "Framework5");
        booklists[5] = new FictionBook(6, "Sach vien tuong 1", 100000, "Author 6", "Vien tuong", 10000);
        booklists[6] = new FictionBook(7, "Sach vien tuong 2", 200000, "Author 7", "Vien tuong", 20000);
        booklists[7] = new FictionBook(8, "Sach vien tuong 3", 300000, "Author 8", "Vien tuong", 30000);
        booklists[8] = new FictionBook(9, "Sach vien tuong 4", 400000, "Author 9", "Vien tuong", 40000);
        booklists[9] = new FictionBook(10, "Sach vien tuong 5", 500000, "Author 10", "Vien tuong", 50000);
        sumOfBooklists(booklists);
        countJavaBooks(booklists);
        sumDiscount(booklists);
    }

    private static void sumDiscount(Book[] booklists) {
        double sumDiscount = 0;
        for (Book book: booklists) {
            if (book instanceof FictionBook){
                FictionBook fictionBook = (FictionBook) book;
                sumDiscount += fictionBook.getPromotionalPrice();
            }
        }
        System.out.println("So tien khuyen mai sach Fiction la: "+ sumDiscount);
    }

    private static void countJavaBooks(Book[] booklists) {
        int countJavaBooks = 0;
        for (Book book : booklists
        ) {
            if (book instanceof ProgrammingBook) {
                String languageOfBooks = ((ProgrammingBook) book).getLanguage();
                if (languageOfBooks.equals("Java")) {
                    countJavaBooks++;
                }
            }
        }
        System.out.println("So sach Java la: " + countJavaBooks);
    }
    private static void sumOfBooklists(Book[] booklists) {
        double sumBooklists = 0;
        for (Book book : booklists
        ) {
            sumBooklists += book.getPrice();
        }
        System.out.println("Tong gia tien 10 cuon sach la: " + sumBooklists);
    }
}
