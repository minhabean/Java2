import java.util.Scanner;

public class Mission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("휴대폰 번호를 입력해주세요. ");
            String input = scanner.nextLine();
            PhoneNumber phoneNumber = new PhoneNumber(input);
            String phoneNumber1 = PhoneNumber.getPhoneNumberFormally();
            try {
                if (phoneNumber1.startsWith("010") && phoneNumber1.length() == 11) {
                    System.out.println("휴대폰 번호를 정상적으로 입력하셨습니다. 입력하신 휴대폰 번호는 "
                        + phoneNumber1 + "입니다.");
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                if (phoneNumber1.length() != 11) {
                    System.out.println("휴대폰 번호는 11글자여야 합니다.");
                } else {
                    System.out.println("휴대폰 번호는 010으로 시작해야 합니다.");
                }
            }
        }
    }
}
