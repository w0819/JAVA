public class DateConverter {
    public static void main(String[] args) {
        String Date = "1970년 01월 23일";

        String year = Date.substring(0, 5);
        String mouth = Date.substring(7, 10);
        String day = Date.substring(11, 13);

        System.out.println(year);
        System.out.println(mouth);
        System.out.println(day);

    }
}
