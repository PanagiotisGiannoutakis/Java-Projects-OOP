import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        Book currentBook;
        for(int i=0; i<books.size(); i++) {
            currentBook = books.get(i);
            if(currentBook.getAvailability()) {
                System.out.println(currentBook.toString());
            }
        }
    }

    public void lendBook(String isbn) {
        Book currentBook;
        boolean found = false;
        for(int i=0; i<books.size(); i++) {
            currentBook = books.get(i);
            if(currentBook.getISBN().equals(isbn)) {
                if(currentBook.getAvailability()) {
                    currentBook.setAvailability(false);
                    found = true;
                    break;
                }
            } 
        }

        if(!found) {
            System.out.println("Το βιβλίο που αναζητάς δεν είναι διαθέσιμο αυτήν την στιγμή.");
        }
    }

    public void returnBook(String isbn) {
        Book currentBook;
        for(int i=0; i<books.size(); i++) {
            currentBook = books.get(i);
            if(currentBook.getISBN().equals(isbn)) {
                currentBook.setAvailability(true);
                System.out.println("Το βιβλίο επιστράφηκε επιτυχώς!");
            }
        }
    }
}