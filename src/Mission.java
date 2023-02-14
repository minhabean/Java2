import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mission {

    public static void main(String[] args) {
        Library library = new Library(Arrays.asList(
            new Book("클린코드(Clean Code)"),
            new Book("객체지향의 사실과 오해"),
            new Book("테스트 주도 개발(TDD)")
        ));
        List<Book> BookList = library.getBookList();
        while (true) {
            System.out.println("대여할 책의 번호를 입력하세요");
            for (int i = 0; i < BookList.size(); i++) {
                Book book = BookList.get(i);
                System.out.println(i + 1 + ". " + book.getName() + " - " + book.getStatus());
            }
            Scanner sc = new Scanner(System.in);
            int bookNum = sc.nextInt() - 1;

            if (BookList.get(bookNum).isBorrowed()) {
                System.out.println("대여 중인 책은 대여할 수 없습니다.");
            } else {
                System.out.println("정상적으로 대여가 완료되었습니다.");
            }
            BookList.get(bookNum).Borrow();
        }
    }
}
