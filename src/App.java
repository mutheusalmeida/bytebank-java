public class App {
    public static void main(String[] args) {
        Account account = new Account();
        account.accounHolder = new Client();

        account.accounHolder.name = "Matheus Almeida";
        account.accounHolder.id = "000.111.222-33";
        account.accounHolder.profession = "Software Developer";
        account.deposit(200);

        System.out.println(account.accounHolder.name + "'s balance is " + account.getAccountBalance());
        
        boolean depositSucceeded = account.deposit(100);
        
        if (depositSucceeded) {
          System.out.println("Deposit succeeded");
          System.out.println(account.accounHolder.name + "'s balance is " + account.getAccountBalance());
        }
        
        boolean isWithdrawalSuccessful = account.withdraw(50);
        
        if (isWithdrawalSuccessful) {
          System.out.println("Withdrawal request successful");
          System.out.println(account.accounHolder.name + "'s balance is " + account.getAccountBalance());
        } else {
          System.out.println("Withdrawal request failed");
        }
    }
}
