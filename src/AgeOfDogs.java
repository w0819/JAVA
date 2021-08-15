public class AgeOfDogs {
    public static void main(String[] args) {
        int winterAge = 3;
        int MexAge = 7;

        boolean winterOlder = winterAge > MexAge;
        boolean sameAge = winterAge == MexAge;
        boolean MexOlder = winterAge < MexAge;

        System.out.println(winterOlder);
        System.out.println(sameAge);
        System.out.println(MexOlder);
    }
}
