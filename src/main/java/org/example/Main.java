public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("George", "Orwell");
        Author author2 = new Author("Murakami", "Haruki");
        Author author3 = new Author("Franz", "Kafka");
        Author author4 = new Author("Alexander", "Pushkin");
        Author author5 = new Author("J.R.R.", "Tolkien");

        Book book1 = new Book("1984", new Author[]{author1});
        Book book2 = new Book("Norwegian Wood", new Author[]{author2});
        Book book3 = new Book("The Metamorphosis", new Author[]{author3});
        Book book4 = new Book("The Captain's Daughter", new Author[]{author4});
        Book book5 = new Book("The Lord of the Rings", new Author[]{author5});


        Book[] books = {book1, book2, book3, book4, book5};

        for (Book book : books) {
            System.out.println(book);
        }
    }
}