public class App {
    public static void main(String[] args) {
        CheckingAccount matheus = new CheckingAccount(new Client(),123, 4, 2000);
        SavingAccount bob = new SavingAccount(new Client(), 444, 5, 2000);

        matheus.getAccountHolder().setName("Matheus Almeida");
        bob.getAccountHolder().setName("Bob Green");

        matheus.withdraw(200);
        bob.withdraw(200);

        System.out.println(matheus.getAccountBalance());
        System.out.println(bob.getAccountBalance());
    }
}
