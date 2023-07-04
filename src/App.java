public class App {
    public static void main(String[] args) {
        Manager manager = new Manager("Katrine", 1234567890, 6000, "1234");
        Administrator administrator = new Administrator("Oswald", 1238468575, 10000, "4444");

        System.out.println(manager.getName());
        System.out.println(manager.authentication("4432"));

        System.out.println(administrator.getName());
        System.out.println(administrator.authentication("4444"));
    }
}
