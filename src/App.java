public class App {
    public static void main(String[] args) {
        CheckingAccount client = new CheckingAccount(new Client(),123, 4, 5000);

        client.deposit(300);

        client.getAccountHolder().setName("Matheu");
        System.out.println(client.getAccountBalance());
    }
}
