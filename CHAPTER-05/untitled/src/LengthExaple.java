public class LengthExaple {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int length = ssn.length();

        if(length == 13) {
            System.out.println("맞습니다.");
        } else {
            System.out.println("틀립니다.");
        }
    }
}
