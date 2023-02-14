import java.util.List;
import java.util.Objects;

public class Library {

    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBookList() {
        return books;
    }
}