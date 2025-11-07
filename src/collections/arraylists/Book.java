package collections.arraylists;

import java.util.ArrayList;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public Book(int id, String title, String author, boolean isBorrowed) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    public String toString() {
        return id + ", " + title + ", " + author + ", " + isBorrowed;

    }

    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();

        book.add(new Book(1, "Bible", "Dennis the Black Jesus", true));
        book.add(new Book(2, "Dictionary", "Macmillan", false));
        book.add(new Book(3, "Poems", "Mazindere", false));
        book.add(new Book(4, "Things Fall Apart", "Chinua Achebe", true));
        book.add(new Book(5, "Gods must be crazy", "Huang", false));

        System.out.println("\nsize: " + book.size());
        System.out.println("Book details at index 0: " + book.get(0));

        System.out.println("\n" + book + "\n"); // prints all records as one array


        for (Book b : book) {
            System.out.println(b.toString());

        }

        book.remove(4);
        System.out.println("\nremoved element 5 \n");

        for (Book b : book) {
            System.out.println(b.toString());

        }


        System.out.println("size: " + book.size());


    }
}
