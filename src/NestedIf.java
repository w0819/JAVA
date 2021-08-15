import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요(숫자만)");
        int age = scanner.nextInt();
        if (age >= 10) {
            if (age < 20) {
                System.out.println("10대");
            } else {
                System.out.println("10대 아님");
            }
        } else {
            System.out.println("10대 아님");
        }
    }
}
