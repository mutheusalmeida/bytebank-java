public class App {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccounHolder(new Client());

        account.getAccounHolder().setName("Matheus Almeida");
        account.getAccounHolder().setId("000.111.222-33");
        account.getAccounHolder().setProfession("Software Developer");
        account.deposit(200);

        System.out.println(account.getAccounHolder().getName() + "'s balance is " + account.getAccountBalance());
        
        boolean depositSucceeded = account.deposit(100);
        
        if (depositSucceeded) {
          System.out.println("Deposit succeeded");
          System.out.println(account.getAccounHolder().getName() + "'s balance is " + account.getAccountBalance());
        }
        
        boolean isWithdrawalSuccessful = account.withdraw(50);
        
        if (isWithdrawalSuccessful) {
          System.out.println("Withdrawal request successful");
          System.out.println(account.getAccounHolder().getName() + "'s balance is " + account.getAccountBalance());
        } else {
          System.out.println("Withdrawal request failed");
        }
    }
}
