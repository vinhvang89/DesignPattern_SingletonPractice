public class Client {
    private BookSingleton book;
    private boolean haveBook;
    public void  borrowBook(){
        book = BookSingleton.borrowBook();
        haveBook = book != null;
    }
    public String getTittle(){
        if(haveBook)
            return book.getTittle();
        else
            return "Lonely , I am so lonely ";
    }
    public void returnBook(){
        book.returnBook(book);
    }
}
