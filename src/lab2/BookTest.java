package lab2;

public class BookTest {
    public static void main(String[] args){
        Book book1 = new Book("Ivanov I.I.", "Interesting stories", 2009);
        System.out.println(book1);
        book1.setYear(1999);
        System.out.println(book1.getYear());
        System.out.println(book1.getName());
    }
}
