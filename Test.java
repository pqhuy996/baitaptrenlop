public class Test {
    public static void main(String[] args) {
        LibaryItem.Book book = new LibaryItem.Book("dalsjk", 2024, "PQH", 1234);
        System.out.println(book.getDetails());
        LibaryItem.Magazine magazine = new LibaryItem.Magazine("dasdasd", 2024, 3214654, "University");
        System.out.println(magazine.getDetails());
    }
}
