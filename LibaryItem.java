public class LibaryItem {
     String title;
     int yearPublished;
    LibaryItem(String title, int yearPublished) {
        this.title = title;
        this.yearPublished = yearPublished;
    }
    public String toString() {
        return title + "\t" + yearPublished;
    }
    static class Book extends LibaryItem {
         private String author;
         private int isbn;
        Book(String title, int yearPublished, String author, int isbn) {
            super(title, yearPublished);
            this.author = author;
            this.isbn = isbn;
        }

        public String getDetails() {
            return "title: " + title + ", year published: " + yearPublished + ", author: " + author + ", isbn: " + isbn;
        }
    }
    static class Magazine extends LibaryItem {
        private int issueNumber;
        private String publisher;
        Magazine(String title, int yearPublished, int issueNumber, String publisher) {
            super(title, yearPublished);
            this.issueNumber = issueNumber;
            this.publisher = publisher;
        }
        public String getDetails() {
            return "title: " + title + ", year published: " + yearPublished + ", issueNumber: " + issueNumber + ", publisher: " + publisher;
        }
    }
}