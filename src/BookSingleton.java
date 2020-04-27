public class BookSingleton {
    private String tittle;
    private String author;
    private static BookSingleton book;
    private static boolean isLoanedOut;
    private BookSingleton(){
        author = "Tào Tháo";
        tittle = "Phàm chuyện trong thiên hạ cứ về nhà hỏi vợ, vợ bảo sao cứ làm ngược lại sự ắt thành";
        book = null;
        isLoanedOut = false;
    }
    public static BookSingleton borrowBook(){
        if(!isLoanedOut) {
            if( book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }
    public void returnBook(BookSingleton book){
        isLoanedOut = false;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
