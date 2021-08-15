import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("달러의 환률을 입력하세요.");
        String exchangeString = scanner.nextLine();
        System.out.println("순대국의 가격을 입력하세요.");
        String priceOfSoupString = scanner.nextLine();
        double exchange = Double.parseDouble(exchangeString);
        double priceSoup = Double.parseDouble(priceOfSoupString);
        System.out.println("순대국은 " + priceSoup / exchange + "달러입니다.");
    }
}
