public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account();
        Client client = new Client();
        account.accounHolder = client;

        account.accounHolder.name = "Matheus Almeida";
        account.accounHolder.id = "000.111.222-33";
        account.accounHolder.profession = "Software Developer";
        account.deposit(200);

        System.out.println(account.accounHolder.name + "'s balance is " + account.accountBalance);
        
        boolean depositSucceeded = account.deposit(100);
        
        if (depositSucceeded) {
          System.out.println("Deposit succeeded");
          System.out.println(account.accounHolder.name + "'s balance is " + account.accountBalance);
        }
        
        boolean isWithdrawalSuccessful = account.withdraw(50);
        
        if (isWithdrawalSuccessful) {
          System.out.println("Withdrawal request successful");
          System.out.println(account.accounHolder.name + "'s balance is " + account.accountBalance);
        } else {
          System.out.println("Withdrawal request failed");
        }
    }
}
