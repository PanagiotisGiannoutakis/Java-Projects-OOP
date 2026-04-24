public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Εισαγωγή στην Πληροφορική", "Σπύρος", "1234");
        Book book2 = new Book("Δομές Δεδομένων", "Πασχάλης", "4321");
        Book book3 = new Book("Βάσεις Δεδομένων", "Δημήτρης", "2314");
        Book book4 = new Book("Άλγεβρα", "Κώστας", "4132");

        Library library = new Library();

        library.addBook(book4);
        library.addBook(book1);
        library.addBook(book3);
        library.addBook(book2);

        library.displayAvailableBooks();

        library.lendBook("4321");
        library.lendBook("4321");
        library.lendBook("4132");

        library.displayAvailableBooks();

        library.returnBook("4132");

        library.displayAvailableBooks();
    }
}