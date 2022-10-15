package prac1;
public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("New Book", "History", "Author B.B.", (int) 2022);
        Book book2 = new Book("New Book2", "History2", "Author C.C.");
        Book book3 = new Book("New Book3", "History3");

        book1.change("Story2");
        System.out.println(book1);
        book2.setAuthor("Author D.D.");
        book3.setYear((int) 1895);
    }
}
