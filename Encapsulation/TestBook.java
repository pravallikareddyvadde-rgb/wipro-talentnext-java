package Encapsulation;

public class TestBook {

    public static void main(String[] args) {

        Author author = new Author("Pravallika", "pravallika@gmail.com", 'F');

        Book book = new Book("Java Programming", author, 599.0, 20);

        System.out.println("Book Name : " + book.getName());
        System.out.println("Author Name : " + book.getAuthor().getName());
        System.out.println("Author Email : " + book.getAuthor().getEmail());
        System.out.println("Author Gender : " + book.getAuthor().getGender());
        System.out.println("Price : " + book.getPrice());
        System.out.println("Quantity : " + book.getQtyInStock());
    }
}