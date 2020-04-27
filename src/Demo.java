public class Demo {
    public static void main(String[] args) {
        System.out.println("BEGIN TESTING SINGLETON PATTERN");

        Client bookBorrower1 = new Client();
        Client bookBorrower2 = new Client();

        bookBorrower1.borrowBook();
        System.out.println("BookBorrower1 asked to borrow the book");
        System.out.println("BookBorrower1  Title: ");
        System.out.println(bookBorrower1.getTittle());


        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 asked to borrow the book");
        System.out.println("BookBorrower2  Title: ");
        System.out.println(bookBorrower2.getTittle());

        bookBorrower1.returnBook();
        System.out.println("BookBorrower1 returned the book");

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2  Title: ");
        System.out.println(bookBorrower1.getTittle());

        System.out.println("END TESTING SINGLETON PATTERN");
    }
}

