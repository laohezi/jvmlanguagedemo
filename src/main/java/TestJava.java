public class TestJava {
    public static void main(String[] args) {
        String version = "1.23.30";
        add(version);
    }

    static void add(String version) {
        System.out.println("the version is $(version)");
    }
}
