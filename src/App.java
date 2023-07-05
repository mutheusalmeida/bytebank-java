public class App {
    public static void main(String[] args) {
        CheckingAccount client = new CheckingAccount(new Client(), 123, 4, 4000);

        client.calculateTax();
        System.out.println(client.getTax());
    }
}
