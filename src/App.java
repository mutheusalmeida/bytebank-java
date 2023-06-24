public class App {
    public static void main(String[] args) throws Exception {
        Account client = new Account();

        client.accounHolder = "Matheus Almeida";
        client.accountBalance = 200;

        System.out.println(client.accountBalance);
        
        client.deposit(100);

        System.out.println(client.accountBalance);

        boolean isWithdrawSuccess = client.withdraw(50);

        System.out.println(client.accountBalance);
        System.out.println(isWithdrawSuccess);
    }
}
