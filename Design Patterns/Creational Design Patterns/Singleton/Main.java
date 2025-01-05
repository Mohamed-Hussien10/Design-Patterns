public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance1();
        Singleton s2 = Singleton.getInstance1();
        System.out.println(s1 == s2);
    }
}
