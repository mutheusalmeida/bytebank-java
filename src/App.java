public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Tyler", 1112223331, 3000);
        Manager manager = new Manager("Bob", 1112223334, 7000, "1234");
        BonificationManagement bonificationManagement = new BonificationManagement();

        System.out.println(employee.getName());
        System.out.println(employee.getBonification());
        System.out.println(employee.getCompensation());

        System.out.println(manager.getName());
        System.out.println(manager.getBonification());
        System.out.println(manager.getCompensation());
        System.out.println(manager.authentication("5768"));
        System.out.println(manager.authentication("1234"));

        bonificationManagement.registerEmployee(employee);
        bonificationManagement.registerEmployee(manager);

        System.out.println(bonificationManagement.getTotal());
    }
}
