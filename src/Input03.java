import java.util.Scanner;

public class Input03 {
    public static void main(String[] args) {
        System.out.println("영어 문장과 한글 문장를 하나씩 입력해보세요.");
        Scanner scanner = new Scanner(System.in);

        String engilshWord = scanner.next();
        String koreanWord = scanner.next();

        System.out.println("입력된 영단어: " + engilshWord);
        System.out.println("입력된 한글 단어: " + koreanWord);
    }
}
