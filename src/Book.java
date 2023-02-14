public class Book {

    private String name;
    private boolean isBorrowed;

    public Book(String name) {
        this.name = name;
        this.isBorrowed = false;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        if (isBorrowed) {
            return "대여 중";
        } else {
            return "대여 가능";
        }
    }

    public void Borrow() {
        this.isBorrowed = true;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}
