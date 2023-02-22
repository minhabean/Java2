public class PhoneNumber {

    private static String value;

    public PhoneNumber(String value) {
        this.validate(value);
        this.value = value;
    }

    private void validate(String phoneNumber) {
        // 로직 구현하기
    }

    public static String getPhoneNumberFormally() {
        return value;
    }
}
