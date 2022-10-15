package prac2;
public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Ivanov I.I.", "abcde123@gmail.com", 'М');
        System.out.println(author.getName() + " " + author.getEmail() + " " + author.getGender());
        author.setEmail("sdwmfe@new.com");
        System.out.println(author);
    }
}
