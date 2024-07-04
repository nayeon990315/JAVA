public class SingletonExample {
    public static void main(String[] args) {
        // 정적 메소드 호출해서 싱글톤 객체 얻음
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 객체 참조");
        }
    }
}
