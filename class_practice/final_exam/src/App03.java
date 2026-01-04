import java.util.Scanner;

class Library {
    Book[] books;

    void listBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].title + "\\" + books[i].author + ":" + books[i].price + "," + books[i].publishDate);
        }
    }

    void printTotalPrice() {
        int total = 0;
        for (int i = 0; i < books.length; i++) {
            total += books[i].price;
        }
        System.out.println(total);
    }
}

class Book {
    String title;
    String author;
    int price;
    String publishDate;
}

public class App03 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Library library = new Library();
    int n = 3;
    library.books = new Book[n];

    for (int i = 0; i < n; i++) {
        Book book = new Book();
        library.books[i] = book;
        book.title = scanner.next();
        book.author = scanner.next();
        book.price = scanner.nextInt();
        book.publishDate = scanner.next();
    }
        library.listBooks();
        library.printTotalPrice();
        scanner.close();
    }
}