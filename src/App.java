public class App {
    public static void main(String[] args) throws Exception {
        Account client = new Account();
        Account client2 = new Account();

        client.accounHolder = "Matheus Almeida";
        client2.accounHolder = "Unknown";
        client.accountBalance = 200;
        client2.accountBalance = 1000;

        System.out.println("Client balance " + client.accountBalance);
        
        client.deposit(100);

        System.out.println("Client balance " + client.accountBalance);
        System.out.println("Client2 balance " + client2.accountBalance);

        boolean isWithdrawalSuccessful = client.withdraw(50);

        if (isWithdrawalSuccessful) {
          System.out.println("Withdrawal request successful");
          System.out.println("Client balance " + client.accountBalance);
        } else {
          System.out.println("Withdrawal request failed");
        }

        boolean isTransferSuccessful = client2.transfer(500, client);

        if (isTransferSuccessful) {
          System.out.println("Transfer successful");
          System.out.println("Client2 balance " + client2.accountBalance);
        } else {
          System.out.println("Transfer failed");
        }
    }
}
