import java.util.Scanner;

public class DogFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("강아지의 몸무게를 입력하세요.");
        String Dogweight = scanner.nextLine();
        try {
            double weight = Double.parseDouble(Dogweight);
            double feed = weight * 10;
            System.out.println("권장 사료량은 " + feed + "g입니다.");
        } catch (Exception exception) {
            System.out.println("명령을 처리 할수 없습니다.");
        }
    }
}
