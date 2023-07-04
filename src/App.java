public class App {
    public static void main(String[] args) {
        Manager manager = new Manager("Bob", 1234567890, 5000, "1234");

        System.out.println(manager.getBonification());
    }
}
