public class App {
    public static void main(String[] args) {
        Account account = new Account(new Client(), 123, 4);

        account.getaccountHolder().setName("Matheus Almeida");
        account.getaccountHolder().setId("000.111.222-33");
        account.getaccountHolder().setProfession("Software Developer");
        account.deposit(200);

        System.out.println(account.getaccountHolder().getName() + "'s balance is " + account.getAccountBalance());
        
        boolean depositSucceeded = account.deposit(100);
        
        if (depositSucceeded) {
          System.out.println("Deposit succeeded");
          System.out.println(account.getaccountHolder().getName() + "'s balance is " + account.getAccountBalance());
        }
        
        boolean isWithdrawalSuccessful = account.withdraw(50);
        
        if (isWithdrawalSuccessful) {
          System.out.println("Withdrawal request successful");
          System.out.println(account.getaccountHolder().getName() + "'s balance is " + account.getAccountBalance());
        } else {
          System.out.println("Withdrawal request failed");
        }
    }
}
