public class Book {
    private String title, author, isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        isAvailable = true;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getISBN() {
        return this.isbn;
    }

    public boolean getAvailability() {
        return this.isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String toString() {
        String mainText = "Ο συγγραφέας με όνομα " + this.author + " έχει γράψει το βιβλίο με τίτλο " + this.title + " που έχει isbn " + this.isbn + " και αυτήν την στιγμή";
        if(this.isAvailable) {
            return mainText + " είναι διαθέσιμο!";
        } else {
            return mainText + " δεν είναι διαθέσιμο.";
        }
    }
}