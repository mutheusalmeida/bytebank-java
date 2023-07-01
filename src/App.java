public class App {
    public static void main(String[] args) {
        Employee empployee = new Employee("Tyler", 1112223331, 3000);
        Manager manager = new Manager("Bob", 1112223334, 7000, "1234");

        System.out.println(empployee.getName());
        System.out.println(empployee.getBonification());
        System.out.println(empployee.compensation);

        System.out.println(manager.getName());
        System.out.println(manager.getBonification());
        System.out.println(manager.authentication("5768"));
        System.out.println(manager.authentication("1234"));
    }
}
