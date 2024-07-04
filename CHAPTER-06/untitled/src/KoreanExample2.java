public class KoreanExample2 {
    public static void main(String[] args) {
        Korean2 k1 = new Korean2("123456-1234567", "김자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        k1.name = "김자바";
    }
}
