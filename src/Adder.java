import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.");
        String firstNumber = scanner.nextLine();
        System.out.println("두 번째 숫자를 입력하세요.");
        String secondNumber = scanner.nextLine();
        try {
            int intFirstNumber = Integer.parseInt(firstNumber);
            int intSecondNumber = Integer.parseInt(secondNumber);
            int number = intFirstNumber + intSecondNumber;
            System.out.println("두 수의 합은 " + number + "입니다." );
        } catch (Exception exception) {
            System.out.println("오류코드: INFO024 \nwoojoo0819@gmail.com에 문의 하십시오.");
        }
    }
}
