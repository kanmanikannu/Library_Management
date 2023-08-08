import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class LibraryItem {
    private int id;
    private String title;
    private int year;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public LibraryItem(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

}

class Book extends LibraryItem {
    private String author;

    public String getAuthor() {
        return author;
    }

    public Book(int id, String title, int year, String author) {
        super(id, title, year);
        this.author = author;
    }


}

class Magazine extends LibraryItem {
    private int issue;

    public int getIssue() {
        return issue;
    }

    public Magazine(int id, String title, int year, int issue) {
        super(id, title, year);
        this.issue = issue;
    }

}

public class Main {
    public static void main(String[] args) {
        Book book = new Book(1, "C Programming", 2003, "Elakiya");
        Magazine magazine = new Magazine(2, "Java", 2004, 5);
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Year: " + book.getYear());
        System.out.println("Book Author: " + book.getAuthor());

        System.out.println();

        System.out.println("Magazine ID: " + magazine.getId());
        System.out.println("Magazine Title: " + magazine.getTitle());
        System.out.println("Magazine Year: " + magazine.getYear());
        System.out.println("Magazine Issue: " + magazine.getIssue());
    }
}
