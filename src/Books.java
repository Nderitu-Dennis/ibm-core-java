
public class Books {
    String title;
    String author;
    String isbn;
    int copies=50; //default

public Books(String title,String  author,String isbn, int copies){
    this.title=title;
    this.author=author;
    this.isbn=isbn;
    this.copies=copies; // Overwrite the default if provided
    }

    public String displayBookInfo(){
    return "title: " + title + "\nauthor: " + author + "\nisbn: " + isbn + "\ncopies: " + copies;

    }
}
