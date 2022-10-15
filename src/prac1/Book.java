public class Book {
    private String book;
    private String name;
    private String author;
    private int yearOfPublishing;

    public Book(String b, String n, String a, int y) {
        book = b;
        name = n;
        author = a;
        yearOfPublishing = y;
    }

    public Book(String b, String n, String a) {
        book = b;
        name = n;
        author = a;
        yearOfPublishing = 2015;
    }

    public Book(String b, String n) {
        book = b;
        name = n;
        author = "Author A.A.";
        yearOfPublishing = 1999;
    }

    public Book(String b) {
        book = b;
        name = "Name_book";
        author = "Book's Author";
        yearOfPublishing = 2006;
    }

    public Book() {
        book = "Story";
        name = "Book1";
        author = "Name";
        yearOfPublishing = 1996;
    }
    public String read() {
        return book;
    }
    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.yearOfPublishing;
    }
    public void change(String book) {
        this.book = book;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    public String toString() {
        return "Name: " + this.name + "\nAuthor: " + this.author + "\nYear of publishing: " + this.yearOfPublishing;
    }

}
